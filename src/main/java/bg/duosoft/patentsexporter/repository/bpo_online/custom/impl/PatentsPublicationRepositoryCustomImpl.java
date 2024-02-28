package bg.duosoft.patentsexporter.repository.bpo_online.custom.impl;

import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;
import bg.duosoft.patentsexporter.repository.bpo_online.custom.PatentsPublicationRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PatentsPublicationRepositoryCustomImpl implements PatentsPublicationRepositoryCustom {
    @PersistenceContext
    protected EntityManager em;

    @Override
    public List<String> selectAuthorityFileRecords(CAuthorityFileFilter filter) {
        String buildQuery = buildQuery(filter);
        Query query = em.createNativeQuery(buildQuery);
        appendQueryParams(filter, query);
        return query.getResultList();
    }

    private String buildQuery(CAuthorityFileFilter filter) {
        StringBuilder queryBuilder = new StringBuilder(
                "select 'BG'||\n" +
                        "case nosect\n" +
                        "    when 1 then RIGHT('000000' || cast(substring(pub.idappli, 5, 6) as varchar(6)), 6)\n" +
                        "    else RIGHT('000000' || cast(pt.idpatent as varchar(6)), 6)\n" +
                        "end ||',' ||\n" +
                        "case nosect\n" +
                        "    when 1 then 'A'\n" +
                        "    when 2 then\n" +
                        "        CASE\n" +
                        "            when dttopubli<'1993-06-01' then 'A1'\n" +
                        "            else 'B1'\n" +
                        "    END\n" +
                        "    when 5 then 'U1'\n" +
                        "end || ',' ||\n" +
                        "to_char (dttopubli, 'YYYYMMDD') || ',' || ','\n" +
                        "from patents.publication pub\n" +
                        "join patents.ptappli pt on pub.idappli=pt.idappli\n" +
                        "where pub.nosect in (1,2,5) and substring(pub.idappli, 11, 1)<>'S'\n");

        Boolean isAllRecords = filter.getIsAllRecords();
        if (Objects.nonNull(isAllRecords) && !isAllRecords) {

            if (Objects.nonNull(filter.getDateFrom())) {
                queryBuilder.append(" AND pub.dttopubli >= :dateFrom\n");
            }

            if (Objects.nonNull(filter.getDateTo())) {
                queryBuilder.append(" AND pub.dttopubli <= :dateTo\n");
            }
        }

        queryBuilder.append("order by case nosect\n" +
                "    when 1 then RIGHT('000000' || cast(substring(pub.idappli, 5, 6) as varchar(6)), 6)\n" +
                "    else RIGHT('000000' || cast(pt.idpatent as varchar(6)), 6)\n" +
                "end,\n" +
                "case nosect\n" +
                "    when 1 then 'A'\n" +
                "    when 2 then\n" +
                "        CASE\n" +
                "            when dttopubli<'1993-06-01' then 'A1'\n" +
                "            else 'B1'\n" +
                "        END\n" +
                "    when 5 then 'U1'\n" +
                "end,\n" +
                "dttopubli");

        return queryBuilder.toString();
    }

    private void appendQueryParams(CAuthorityFileFilter filter, Query query) {
        Boolean isAllRecords = filter.getIsAllRecords();
        if (Objects.nonNull(isAllRecords) && !isAllRecords) {

            LocalDate dateFrom = filter.getDateFrom();
            if (Objects.nonNull(dateFrom)) {
                query.setParameter("dateFrom", dateFrom);
            }

            LocalDate dateTo = filter.getDateTo();
            if (Objects.nonNull(dateTo)) {
                query.setParameter("dateTo", dateTo);
            }
        }
    }
}

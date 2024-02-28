package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPublicationEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPublicationEntityPK;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import bg.duosoft.patentsexporter.repository.bpo_online.custom.PatentsPublicationRepositoryCustom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PatentsPublicationRepository extends BaseRepository<PatentsPublicationEntity, PatentsPublicationEntityPK>, PatentsPublicationRepositoryCustom {

    @Query("SELECT c FROM PatentsPublicationEntity c WHERE c.publisect.idsection = :nosect and c.nogazette = :number and c.yygazette = :year order by c.pk.ptappli.idAppli")
    List<PatentsPublicationEntity> getPublicationsByNosectNumberYear(@Param("number") String number, @Param("year") Integer year, @Param("nosect") Integer nosect);

    @Query("SELECT c.dttopubli FROM PatentsPublicationEntity c WHERE c.nogazette = :number and c.yygazette = :year")
    List<LocalDate> getFirstDtToPubli(@Param("number") String number, @Param("year") Integer year);

    @Query("SELECT distinct c.nogazette FROM PatentsPublicationEntity c WHERE c.publisect.idsection in (1, 2, 5) and c.yygazette = :year order by c.nogazette")
    List<String> getJournals(@Param("year") Integer year);

    @Query("SELECT distinct p.yygazette FROM PatentsPublicationEntity p WHERE p.publisect.idsection IN(1,2,5) AND p.yygazette IS NOT NULL ORDER BY p.yygazette")
    List<Integer> getPublicationYears();

}

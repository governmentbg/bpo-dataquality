package bg.duosoft.patentsexporter.domain.entity.bpo_online.public_;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "vw_agent", schema = "public")
public class VAgentEntity implements Serializable {

    @Id
    @Column(name = "idagent")
    private String idagent;

    @Column(name = "adagent")
    private String adagent;

    @Column(name = "dmspecia")
    private Integer dmspecia;

    @Column(name = "emailagent")
    private String emailagent;

    @Column(name = "faxagent")
    private String faxagent;

    @Column(name = "fnagent")
    private String fnagent;

    @Column(name = "idcountry")
    private String idcountry;

    @Column(name = "idtown")
    private String idtown;

    @Column(name = "kdagent")
    private Integer kdagent;

    @Column(name = "midnagent")
    private String midnagent;

    @Column(name = "natioagent")
    private String natioagent;

    @Column(name = "nmagent")
    private String nmagent;

    @Column(name = "nmstate")
    private String nmstate;

    @Column(name = "nmtown")
    private String nmtown;

    @Column(name = "telagent")
    private String telagent;

    @Column(name = "titagent")
    private String titagent;

    @Column(name = "full_name_agent")
    private String fullNameAgent;

    @Column(name = "fnagent_en")
    private String fnagentEn;

    @Column(name = "midnagent_en")
    private String midnagentEn;

    @Column(name = "nmagent_en")
    private String nmagentEn;

    @Column(name = "nmtown_en")
    private String nmtownEn;

    @Column(name = "adagent_en")
    private String adagentEn;

    @Column(name = "full_name_agent_en")
    private String fullNameAgentEn;

    @Column(name = "ntincorp")
    private Integer ntincorp;
}

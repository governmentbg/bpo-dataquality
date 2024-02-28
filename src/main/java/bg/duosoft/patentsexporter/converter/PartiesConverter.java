package bg.duosoft.patentsexporter.converter;

import bg.duosoft.patentsexporter.domain.core.*;
import bg.duosoft.patentsexporter.domain.jaxb.generated.*;
import bg.duosoft.patentsexporter.service.*;
import bg.duosoft.patentsexporter.util.Transliteration;
import bg.duosoft.patentsexporter.util.UtilsPatent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class PartiesConverter {

    private final InventService inventService;

    private final PatentsOwnService patentsOwnService;
    private final OwnerService ownerService;

    private final PatentsRepresentService representService;
    private final AgentService agentService;

    private final CountryService countryService;

    public Parties parties(CPatentsPublication publication, boolean isTransliterate) {
        String idappli = publication.getPtappli().getIdAppli();
        Parties parties = new Parties();
        parties.setApplicants(applicants(idappli, isTransliterate));
        parties.setAgents(agents(idappli, isTransliterate));
        parties.setInventors(inventors(idappli, isTransliterate));
        return parties;

    }

    private Applicants applicants(String idappli, boolean isTransliterate) {
        Applicants applicants = new Applicants();
        List<CVPatentsOwn> ownByIdappli = patentsOwnService.getOwnByIdappli(idappli);
        if (ownByIdappli == null || ownByIdappli.size() == 0)
            return null;
        for (CVPatentsOwn own : ownByIdappli) {
            List<CVOwner> ownerByIdowner = ownerService.getOwnerByIdInvent(own.getOwner().getIdowner());
            if (ownerByIdowner == null || ownerByIdowner.size() == 0)
                return null;
            for (CVOwner owner : ownerByIdowner) {
                Applicant aplicant = new Applicant();
                aplicant.setSequence(UtilsPatent.toFourNumbers(String.valueOf(own.getOdowner())));
                aplicant.getAddressbook().add(getAddressBookType(owner, countryService, isTransliterate));

                Country country = new Country();
                country.setContent(owner.getNationown());

                Nationality nationality = new Nationality();
                nationality.setCountry(country);

                Residence residence = new Residence();
                residence.setCountry(country);

                aplicant.setNationality(nationality);
                aplicant.setResidence(residence);
                applicants.getApplicant().add(aplicant);
            }

        }
        return applicants;
    }

    private Inventors inventors(String idappli, boolean isTransliterate) {
        Inventors inventors = new Inventors();
        List<CVInvent> inventByIdappli = inventService.getInventByIdappli(idappli);
        if (inventByIdappli == null || inventByIdappli.size() == 0)
            return null;
        for (CVInvent invent : inventByIdappli) {
            List<CVOwner> ownerByIdinvent = ownerService.getOwnerByIdInvent(invent.getInventor().getIdowner());
            if (ownerByIdinvent == null || ownerByIdinvent.size() == 0)
                return null;
            for (CVOwner owner : ownerByIdinvent) {
                Inventor inventor = new Inventor();
                inventor.setSequence(UtilsPatent.toFourNumbers(String.valueOf(invent.getOrdinvent())));
                inventor.getAddressbook().add(getAddressBookType(owner, countryService, isTransliterate));
                inventors.getInventor().add(inventor);
            }
        }

        return inventors;
    }

    private Agents agents(String idappli, boolean isTransliterate) {
        Agents agents = new Agents();
        List<CVPatentsRepresent> representsByIdappli = representService.getRepresentByIdappli(idappli);
        if (representsByIdappli == null || representsByIdappli.size() == 0)
            return null;
        for (CVPatentsRepresent represent : representsByIdappli) {
            List<CVAgent> agentList = agentService.getAgentsByIdAgent(represent.getAgent().getIdagent());
            if (agentList == null || agentList.size() == 0)
                return null;
            for (CVAgent agent : agentList) {
                Agent newAgent = new Agent();
                newAgent.setSequence(UtilsPatent.toFourNumbers(String.valueOf(represent.getOdagent())));
                newAgent.getAddressbook().add(getAddressBookType(agent, countryService, isTransliterate));
                agents.getAgent().add(newAgent);
            }
        }
        return agents;
    }

    private AddressBookType getAddressBookType(CVOwner owner, CountryService countryService, boolean isTransliterate) {
        AddressBookType address = new AddressBookType();

        FormattedNameAddressType formattedNameAddress = new FormattedNameAddressType();
        NameType nameType = new NameType();
        FormattedNameType formattedName = new FormattedNameType();
        formattedName.setNamePrefix(Transliteration
                .translit(owner.getTitowner() != null ? owner.getTitowner().trim() : null, isTransliterate));
        formattedName.setFirstName(Transliteration
                .translit(owner.getFnowner() != null ? owner.getFnowner().trim() : null, isTransliterate));
        formattedName.setMiddleName(Transliteration
                .translit(owner.getMidnowner() != null ? owner.getMidnowner().trim() : null, isTransliterate));
        formattedName.setLastName(Transliteration
                .translit(owner.getNmowner() != null ? owner.getNmowner().trim() : null, isTransliterate));
        formattedName.setOrganizationName(Transliteration
                .translit(owner.getNtincorp() != null ? owner.getNtincorp().toString().trim() : null, isTransliterate));
        nameType.setFormattedName(formattedName);
        formattedNameAddress.setName(nameType);

        AddressType addressType = new AddressType();
        FormattedAddressType formattedAddressType = new FormattedAddressType();
        formattedAddressType.setAddressStreet(Transliteration
                .translit(owner.getAdowner() != null ? owner.getAdowner().trim() : null, isTransliterate));
        formattedAddressType.setAddressCity(
                Transliteration.translit(owner.getNmtown() != null ? owner.getNmtown().trim() : null, isTransliterate));
        if (isTransliterate) {
            String countryCode = countryService.getEngCountryNameByCode(owner.getIdcountry());
            formattedAddressType.setAddressCounty(countryCode != null ? countryCode.trim() : null);
        } else {
            String countryCode = countryService.getEngCountryNameByCode(owner.getIdcountry());
            formattedAddressType.setAddressCounty(countryCode != null ? countryCode.trim() : null);
        }
        formattedAddressType.setAddressState(Transliteration
                .translit(owner.getNmstate() != null ? owner.getNmstate().trim() : null, isTransliterate));
        formattedAddressType.setAddressPostcode(
                Transliteration.translit(owner.getIdtown() != null ? owner.getIdtown().trim() : null, isTransliterate));
        formattedAddressType.setFormattedAddressCountryCode(Transliteration
                .translit(owner.getIdcountry() != null ? owner.getIdcountry().trim() : null, isTransliterate));
        addressType.setFormattedAddress(formattedAddressType);
        formattedNameAddress.setAddress(addressType);
        address.setFormattedNameAddress(formattedNameAddress);

        AddressBookType.ContactInformationDetails contactInformationDetails = new AddressBookType.ContactInformationDetails();
        contactInformationDetails.getPhone().add(owner.getTelowner() != null ? owner.getTelowner().trim() : null);
        contactInformationDetails.getFax().add(owner.getFaxowner() != null ? owner.getFaxowner().trim() : null);
        contactInformationDetails.getEmail().add(owner.getEmailowner() != null ? owner.getEmailowner().trim() : null);
        address.setContactInformationDetails(contactInformationDetails);

        return address;
    }

    private AddressBookType getAddressBookType(CVAgent agent, CountryService countryService, boolean isTransliterate) {
        AddressBookType address = new AddressBookType();

        FormattedNameAddressType formattedNameAddress = new FormattedNameAddressType();
        NameType nameType = new NameType();
        FormattedNameType formattedNameType = new FormattedNameType();
        formattedNameType.setNamePrefix(Transliteration
                .translit(agent.getTitagent() != null ? agent.getTitagent().trim() : null, isTransliterate));
        formattedNameType.setFirstName(Transliteration
                .translit(agent.getFnagent() != null ? agent.getFnagent().trim() : null, isTransliterate));
        formattedNameType.setMiddleName(Transliteration
                .translit(agent.getMidnagent() != null ? agent.getMidnagent().trim() : null, isTransliterate));
        formattedNameType.setLastName(Transliteration
                .translit(agent.getNmagent() != null ? agent.getNmagent().trim() : null, isTransliterate));
        nameType.setFormattedName(formattedNameType);
        formattedNameAddress.setName(nameType);

        AddressType addressType = new AddressType();
        FormattedAddressType formattedAddressType = new FormattedAddressType();
        formattedAddressType.setAddressStreet(Transliteration
                .translit(agent.getAdagent() != null ? agent.getAdagent().trim() : null, isTransliterate));
        formattedAddressType.setAddressCity(
                Transliteration.translit(agent.getNmtown() != null ? agent.getNmtown().trim() : null, isTransliterate));
        if (isTransliterate) {
            String countryCode = countryService.getEngCountryNameByCode(agent.getIdcountry());
            formattedAddressType.setAddressCounty(countryCode != null ? countryCode.trim() : null);
        } else {
            String countryCode = countryService.getEngCountryNameByCode(agent.getIdcountry());
            formattedAddressType.setAddressCounty(countryCode != null ? countryCode.trim() : null);
        }
        formattedAddressType.setAddressState(Transliteration
                .translit(agent.getNmstate() != null ? agent.getNmstate().trim() : null, isTransliterate));
        formattedAddressType.setAddressPostcode(
                Transliteration.translit(agent.getIdtown() != null ? agent.getIdtown().trim() : null, isTransliterate));
        formattedAddressType.setFormattedAddressCountryCode(Transliteration
                .translit(agent.getIdcountry() != null ? agent.getIdcountry().trim() : null, isTransliterate));
        addressType.setFormattedAddress(formattedAddressType);
        formattedNameAddress.setAddress(addressType);
        address.setFormattedNameAddress(formattedNameAddress);

        AddressBookType.ContactInformationDetails contactInformationDetails = new AddressBookType.ContactInformationDetails();
        contactInformationDetails.getPhone().add(agent.getTelagent() != null ? agent.getTelagent().trim() : null);
        contactInformationDetails.getFax().add(agent.getFaxagent() != null ? agent.getFaxagent().trim() : null);
        contactInformationDetails.getEmail().add(agent.getEmailagent() != null ? agent.getEmailagent().trim() : null);
        address.setContactInformationDetails(contactInformationDetails);

        return address;
    }

}

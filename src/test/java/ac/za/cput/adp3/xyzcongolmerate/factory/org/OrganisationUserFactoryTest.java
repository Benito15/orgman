package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {



    @Test
    public void buildOrganisationUser() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Microsoft");
        User user = UserFactory.buildUser("b.kriel34@gmail.com","Benito","Kriel");

        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser(organisation.getOrgCode(),user.getUserEmail());
        Assert.assertNotNull(organisationUser.getOrgCode());
    }
}
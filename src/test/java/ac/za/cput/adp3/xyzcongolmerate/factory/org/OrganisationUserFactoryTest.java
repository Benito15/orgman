package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisationUser() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Microsoft");
        User user = UserFactory.buildUser("b.kriel34@gmail.com","Benito","Kriel");

        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser(organisation.getOrgCode(),user.getUserEmail());
        Assert.assertNotNull(organisationUser.getOrgCode());


        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the OrganisationUserFactory class
         * 3. Assert that the an object is created.
         */
    }
}
package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        User user = UserFactory.buildUser("b.kriel34@gmail.com","Benito","Kriel");
        Role role = RoleFactory.buildRole("Mechanic");
        Organisation organisation = OrganisationFactory.buildOrganisation("Microsoft");

        UserRole userRole = UserRoleFactory.buildUserRole(organisation.getOrgCode(), user.getUserEmail(), role.getRoleId());

        Assert.assertNotNull(userRole.getRoleId());
        System.out.println(userRole);

    }
}
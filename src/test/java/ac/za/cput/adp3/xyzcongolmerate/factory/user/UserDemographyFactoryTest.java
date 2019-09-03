package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Test;

import java.util.Date;


public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("White");
        Date date = new Date();

        UserDemography userDemography =
                UserDemographyFactory.buildUserDemography
                        ("benkriel@gmail.com","Mr",gender.getGenderId(), race.getRaceId(), date);
        System.out.println(userDemography.getGenderId());

    }
}
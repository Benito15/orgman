package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {

        String className = getClassName(aClass);

        char[] letterOfClass = className.toCharArray();

        String prefix ="";

            for (int i = 0; i < letterOfClass.length;i++)
            {

               if(Character.isUpperCase(className.charAt(i)))
                {
                       prefix += className.charAt(i);
                }

            }

        return prefix;

    }


    public static void main(String[] args) {

    }

}

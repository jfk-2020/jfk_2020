package enumeration;

import java.sql.SQLOutput;

public class test {

    public static void main(String[] args) {
        PhoneCode phoneCode = PhoneCode.ARM;
        System.out.println(PhoneCode.findByPhoneCode("+374"));


        Seasons seasons = Seasons.AUTUMN;
        System.out.println(seasons.toString());
        System.out.println(Seasons.findByMonthsCount(1));

        System.out.println(Gender.findByCountry("Armenia"));
        Gender gender = Gender.FEMALE;
        System.out.println(gender.toString());
    }

}

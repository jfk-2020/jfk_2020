package Class_Functionals.Classes_UML.Date;

import com.jfk.oop.ManualTransmission;

public class test_Date {
    public static void main(String[] args) {

        Date object = Date.getInstance(22,5,1990);



        System.out.println(object);
        System.out.println(object.getDay());
        System.out.println(object.getMonth());
        System.out.println(object.getYear());
        object.setDay(2);
        object.setMonth(4);
        object.setYear(2006);
        object.setDate(15,5,1855);    // vonc anem, vor arzheq@ NULL beri???
        System.out.println(object);
    }
}

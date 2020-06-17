package Class_Functionals.Classes_UML.Date;

public class test_Date {
    public static void main(String[] args) {

        Date object = new Date (22,5,1990);

        System.out.println(object);
        System.out.println(object.getDay());
        System.out.println(object.getMonth());
        System.out.println(object.getYear());
        object.setDay(2);
        object.setMonth(4);
        object.setYear(2006);
        object.setDate(9,6,10000); // vonc anem, vor arzheq@ NULL beri???
        System.out.println(object.toString());
    }
}

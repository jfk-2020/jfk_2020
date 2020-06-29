package com.jfk.abstractclass;

/**
 * @author William Arustamyan
 */

public class AbstractApplication {

    public static void main(String[] args) {
        AbstractEmployee abstractEmployee = new Developer("java", "Gaspar", "Tumanyan", 23);
        abstractEmployee.gender();

        Developer developer = new Developer("java", "Gaspar", "Tumanyan", 23) {
            public String getProfession() {
                return "ESIM INCH";
            }
        };

        Manager manager = new Manager("sdsd", "fff", 555) {
            public String gender() {
                return "XXXX";
            }
        };

        AbstractEmployee employee = new AbstractEmployee("xxx", "sss", 23) {
            @Override
            public String gender() {
                return "FEMALE";
            }

            @Override
            public String getProfession() {
                return "TEST";
            }
        };


        System.out.println(employee.gender());
    }
}

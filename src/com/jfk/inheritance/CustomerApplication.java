package com.jfk.inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author William Arustamyan
 */

public class CustomerApplication {




    public static void main(String[] args) {

//        CustomerGoogle customerGoogle = new Customer("222");
//        customerGoogle.getAddress();

        Customer customer = new CustomerGoogle("address");

        Accouter accouter = new Accouter("name", 37);
        Auditor auditor = new Auditor(57, 65);
        Employee[] employees = {accouter, auditor};
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getAge();
            System.out.println(employees[i]);
        }
        System.out.println((double) sum / employees.length);
    }
}

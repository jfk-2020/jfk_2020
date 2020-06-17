package Class_Functionals.Classes_UML.Account;

import Class_Functionals.Classes_UML.Account.Account;

public class test_Account {
    public static void main(String[] args) {

        Account object = new Account ("000705814","SERGEY");
        Account object_1 = new Account ("AH0219241","TIGRAN", 20);

        System.out.println(object);
        System.out.println(object_1);
        System.out.println(object.getId());
        System.out.println(object.getName());
        System.out.println(object_1.getId());
        System.out.println(object_1.getName());
        System.out.println(object_1.getBalance());
        System.out.println(object.credit(10));
        System.out.println(object_1.credit(10));
        System.out.println(object.debit(20));
        System.out.println(object_1.debit(20));
        System.out.println(object.transferTo(object_1, 10));
        System.out.println(object_1.transferTo(object, 10));
        System.out.println(object.toString());
        System.out.println(object_1.toString());
    }
}

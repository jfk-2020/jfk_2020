package Class_Functionals.Classes_UML.Employee;

public class test_Employee {
    public static void main(String[] args) {

        Employee person = new Employee(705814, "Sergey", "Petrosyan", 25000);

        System.out.println(person);
        System.out.println(person.getId());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getName());
        System.out.println(person.getSalary());
        person.setSalary(52000);
        System.out.println(person.getAnnualSalary());
        System.out.println(person.raiseSalary(5));
        System.out.println(person.toString());
    }
}

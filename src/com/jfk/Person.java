package com.jfk;

/**
 * @author William Arustamyan
 */

public class Person {

    int age;
    String email;
    String username;

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 20;
        person.email = "test@gmail.com";
        person.username = "test";
        System.out.println(person);
    }

    public String toString() {
        return "age : " + age + ", email : " + email + ", username : " + username;
    }

}
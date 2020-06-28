package com.jfk.homeworkEnum;

public class MainGender {
    public static void main(String[] args) {
        Gender gender = Gender.getGender(3);
        if (gender == null) {
            System.out.println("Gender not found");
        } else {
            System.out.println(gender.value);
        }
    }
}

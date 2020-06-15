package com.jfk.implementClasses;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Account tatevAccount = new Account(UUID.randomUUID().toString(), "Tatev", 5000);
        Account another = new Account(UUID.randomUUID().toString(), "anotherAccount");

        System.out.println(tatevAccount);
        System.out.println(another);
    }
}

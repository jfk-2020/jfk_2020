package com.jfk.implementClasses;

public class Account {

    //Fields of the account
    String id;
    String name;
    int balance = 0;

    //Creating constructor one
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Creating constructor second
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Creating function, methods for the class

    public int credit(int amount) {
        return balance += amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;

    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance = amount;

        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

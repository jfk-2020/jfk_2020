package com.jfk.Lesson14_UML;

class AmountExceededBalance extends Exception {}

public class Account {
    private String id;
    private String name;
    private int balance = 0;
    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit (int amount) throws AmountExceededBalance{
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new AmountExceededBalance();
        }
        return balance;
    }
    public int transfer (Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString() {
        return String.format("Acount [id=%s, name=%s, balance=%d]", id, name, balance);
    }

    public static void main(String[] args) {
        Account account = new Account("0001", "Artur Chilingaryan", 1_000_000_000);
        System.out.println(account);
    }
}

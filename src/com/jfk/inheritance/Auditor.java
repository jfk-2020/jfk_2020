package com.jfk.inheritance;

/**
 * @author William Arustamyan
 */

public class Auditor extends Employee {

    private int amount;

    public Auditor(int amount, int age) {
        super(age);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Auditor{" +
                "amount=" + amount +
                ", age=" + age +
                '}';
    }
}

package com.jfk.inheritance;

/**
 * @author William Arustamyan
 */

public class CustomerGoogle extends Customer {

    private String address;

    public CustomerGoogle(String address) {
        super("Google inc.");
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
}

package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class HiddenPerson {

    private Address address;

    public HiddenPerson(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

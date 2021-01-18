package com.company.advJ.models;

public class CustomerForAccount extends Customer {

    private char gender;

    public CustomerForAccount(int id, String name, char gender) {
        super(id, name);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CustomerForAccount{" +
                "gender=" + gender +
                "} ";
    }
}

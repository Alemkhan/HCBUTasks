package com.company.advJ.models;

public class CustomerForInvoice extends Customer{

    private int discount;

    public CustomerForInvoice(int id, String name, int discount) {
        super(id, name);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "discount=" + discount +
                "} ";
    }
}

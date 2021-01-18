package com.company.advJ.models;

public class Invoice {

    private int id;
    private CustomerForInvoice customer;
    private double amount;

    public Invoice(int id, CustomerForInvoice customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public CustomerForInvoice getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(CustomerForInvoice customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }

}

package com.company.advJ.models;

public class Account {

    private int id;
    private CustomerForAccount customer;
    private double balance;

    public Account(int id, CustomerForAccount customer) {
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }

    public Account(int id, CustomerForAccount customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public CustomerForAccount getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Amount exceeds current balance");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + id +
                ", customer=" + customer.getName() +
                ", balance=" + (double)Math.round(balance * 100) / 100 +
                '}';
    }

}

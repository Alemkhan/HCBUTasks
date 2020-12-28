package com.company.javaTasks;

public class Account {

    private final String id;
    private final String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
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
        return balance = balance + amount;
    }

    public int debit(int amount) {

        if (amount >= balance)
            System.out.println("No enough balance on the wallet");
        else
            balance-=amount;

        return balance;

    }

    public int transferTo(Account another, int amount) {

        if (amount >= balance)
            System.out.println("No enough balance on the wallet");
        else {
            balance-=amount;
            another.credit(amount);
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

package com.company.advJ.tests;

import com.company.advJ.models.Account;
import com.company.advJ.models.CustomerForAccount;

public class AccountTest {

    public static void main(String[] args) {

        CustomerForAccount customerB = new CustomerForAccount(111, "Aida", 'F');
        Account account = new Account(1, customerB, 10000);
        System.out.println(account);
        System.out.println(account.deposit(2000));
        System.out.println(account.withdraw(8000));

    }

}

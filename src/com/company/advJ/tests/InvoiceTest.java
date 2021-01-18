package com.company.advJ.tests;

import com.company.advJ.models.CustomerForInvoice;
import com.company.advJ.models.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        CustomerForInvoice customer = new CustomerForInvoice(111, "Alemkhan", 90);
        Invoice invoice = new Invoice(132, customer, 3000);
        System.out.println(invoice);
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmountAfterDiscount());

    }

}

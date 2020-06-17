package com.jfk.implementClasses;

public class MainInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("ID01", "Description about invoice", 13, 100);
        System.out.println(invoiceItem);
        System.out.println(invoiceItem.getTotal());

    }
}

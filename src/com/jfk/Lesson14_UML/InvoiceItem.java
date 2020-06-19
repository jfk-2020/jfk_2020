package com.jfk.Lesson14_UML;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;
    }
    @Override
    public String toString() {
        return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%f]", id, desc, qty, unitPrice);
    }

    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("0001", "aplle", 10, 100.0);
        System.out.println(invoiceItem);
    }
}

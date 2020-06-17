package Class_Functionals.Classes_UML.InvoiceItem;

public class test_InvoiceItem {
    public static void main(String[] args) {

        InvoiceItem object = new InvoiceItem("705814", "HAKARAK", 10,25.36);

        System.out.println(object);
        System.out.println(object.getId());
        System.out.println(object.getDesc());
        System.out.println(object.getQty());
        object.setQty(10);
        System.out.println(object.getUnitPrice());
        object.setUnitPrice(30.48);
        System.out.println(object.getTotal());
        System.out.println(object.toString());
    }
}

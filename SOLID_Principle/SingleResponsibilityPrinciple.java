package 1_SOLID_Principle;
/*
 S stands for Single Responsibility Principle which means every class should have single responsibility.
 Each class should have only one reason to change.
 */
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Marker marker = new Marker("Camel","Red",2022,10);
        Invoice markerInvoice = new Invoice(marker,3);
        InvoiceDao markerDao = new InvoiceDao(markerInvoice);
        markerDao.saveToDB();
        InvoicePrinter markerPrinter = new InvoicePrinter(markerInvoice);
        markerPrinter.print();
    }
}
class Marker{
    String name;
    String color;
    int year;
    int price;
    public Marker(String name, String color, int year, int price){
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}
/*
This class Invoice doesn't following single responsibility because
this class can be changed by 3 different reasons :-
1. If we want to change calculateTotal.
2. On change of printInvoice.
3. On change of saveToDB.

class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (marker.price)*(this.quantity);
        return price;
    }
    public void printInvoice(){
        //Print the invoice
    }
    public void saveToDB(){
        //Save to DB
    }
}*/


/*
This invoice class can be changed only on one reason.
i.e If we want to modify its Invoice such as adding GST etc
*/

class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (marker.price)*(this.quantity);
        return price;
    }
}

class InvoiceDao{
    private Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        //Save to DB
        System.out.println("Save to DB");
    }
}
class InvoicePrinter{
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void print(){
        //Print the invoice
        System.out.println(this.invoice.calculateTotal());
        System.out.println("Invoice Printed");
    }
}
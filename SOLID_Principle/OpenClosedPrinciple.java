package SOLID_Principle;
/*
O- Stands for Open Closed Principle. i.e Every class
should be open for extension but closed for modification
*/
public class OpenClosedPrinciple {
    public static void main(String[] args) {

    }
}

/*
Below class doesn't follow Open closed principle because lets assume we want
to add saveToFile feature in InvoiceDao class then we have to add another method of it
inside that class, that means it's also open for modification
*/

class NewInvoiceDao {
    private Invoice invoice;

    public NewInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        //Save to DB
        System.out.println("Save to DB");
    }
    public void saveToFile(){
        //Save to file
    }
}

/*
Instead we are creating InvoiceDao interface
*/

interface InvoiceDaoInterface{
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDaoInterface{
    @Override
    public void save(Invoice invoice){
        //Save to DB
    }
}


class FileInvoiceDao implements InvoiceDaoInterface{
    @Override
    public void save(Invoice invoice){
        //Save to file
    }
}

/*
Similarly we can extend multiple feature of InvoiceDaoInterface
*/
public class Payment {
    Bill bill;

    Payment(Bill bill) {
        this.bill = bill;
    }

    public boolean makePayment(float amount) {
        if (bill.amount <= amount) {
            bill.isPaymentDone = true;
            return true;
        }
        return false;
    }
}

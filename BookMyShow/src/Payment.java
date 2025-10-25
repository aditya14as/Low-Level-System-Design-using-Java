import enums.PaymentStatus;

public class Payment {
    int id;
    PaymentStatus paymentStatus;
    int amount;

    Payment(int id, PaymentStatus paymentStatus, int amount) {
        this.id = id;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }
}

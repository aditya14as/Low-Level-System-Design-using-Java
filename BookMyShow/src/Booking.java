import java.util.*;

public class Booking {
    int id;
    Show show;
    List<Seat> seats;
    Payment payment;

    Booking(int id, Show show, List<Seat> seats) {
        this.id = id;
        this.show = show;
        this.seats = seats;
    }

    public int getAmount() {
        int amount = 0;
        for (Seat seat : seats) {
            amount += seat.price;
        }
        return amount;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

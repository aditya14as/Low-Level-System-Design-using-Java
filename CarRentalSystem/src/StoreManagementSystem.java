import java.security.InvalidAlgorithmParameterException;
import java.util.*;

//TODO make it singleton
public class StoreManagementSystem {
    List<User> users;
    Location location;
    VMS vms;

    StoreManagementSystem() {
        location = new Location(1, 1);
        vms = new VMS();
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Vehicle getVehicle() {
        return vms.getAvailableVehicle();
    }

    public Bill bookVehicle(User user, float startTime, float endTime, Vehicle vehicle) {
        Bill bill = new Bill(vehicle, startTime, endTime, user);
        vms.bookVehicle(vehicle);
        return bill;
    }

    public boolean makePayment(Bill bill, float amount, PaymentMode paymentMode) {
        Payment payment = getPayment(bill, paymentMode);
        if (payment.makePayment(amount)) {
            System.out.println("Payment Success");

            return true;
        }
        System.out.println("Payment failed");
        return false;
    }

    public boolean completeRide(Vehicle vehicle) {
        if (vms.setAvailable(vehicle)) {
            System.out.println("Ride complement");
            return true;
        }
        return false;
    }

    private Payment getPayment(Bill bill, PaymentMode paymentMode) {
        if (paymentMode == PaymentMode.CASH) {
            return new CashPayment(bill);
        }
        return new OnlinePayment(bill);
    }
}

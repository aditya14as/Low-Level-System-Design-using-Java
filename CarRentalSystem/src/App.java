public class App {
    public static void main(String[] args) throws Exception {
        StoreManagementSystem sms = new StoreManagementSystem();
        User u1 = new User("U1", new Location(0, 0), "DL");
        sms.addUser(u1);
        Vehicle v1 = sms.getVehicle();
        System.out.println("Vehicle is:" + v1.name);
        Bill bill = sms.bookVehicle(u1, 1, 10, v1);
        System.out.println("Amount to pay is:" + bill.amount);
        sms.makePayment(bill, 180, PaymentMode.CASH);
        // Todo generate invoice
        sms.completeRide(v1);
    }
}

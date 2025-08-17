public class Bill {
    Vehicle vehicle;
    float startTime;
    float endTime;
    User user;
    boolean isPaymentDone;
    float amount;

    Bill(Vehicle vehicle, float startTime, float endTime, User user) {
        this.vehicle = vehicle;
        this.startTime = startTime;
        this.endTime = endTime;
        this.user = user;
        this.amount = generateBill();
    }
    //TODO make strategy pattern to generate different bill based on vehicle type and seater
    private float generateBill() {
        amount = (this.endTime - this.startTime) * 20;
        return amount;
    }
}

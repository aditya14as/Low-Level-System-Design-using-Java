public class Vehicle {
    String name;
    int wheel;
    Status status;

    // TODO can add seater
    Vehicle(String name, int wheel) {
        this.name = name;
        this.wheel = wheel;
        this.status = Status.AVAILABLE; // Default to available
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

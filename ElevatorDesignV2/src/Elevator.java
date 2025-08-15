
public class Elevator {
    Display display;
    InternalButton internalButton;
    int currentFloor;
    Status status;
    Direction direction;

    Elevator() {
        display = new Display(currentFloor, direction);
        internalButton = new InternalButton();
        currentFloor = 0;
        status = Status.IDLE;
        direction = Direction.UP;
    }

    public void pressButton(int destination) {
        internalButton.pressButton(destination, this);
    }

    public void move(Direction direction, int destinationFloor) {
        if (direction == Direction.UP) {
            for (int i = currentFloor; i <= destinationFloor; i++) {
                this.currentFloor = i;
                display.setDisplay(i, direction);
                display.show();
            }
            System.out.println("Destination Floor: " + destinationFloor);
        } else {
            for (int i = currentFloor; i >= destinationFloor; i--) {
                this.currentFloor = i;
                display.setDisplay(i, direction);
                display.show();
            }
            System.out.println("Destination Floor: " + destinationFloor);
        }
    }
}

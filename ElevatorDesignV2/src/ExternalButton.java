public class ExternalButton {

    int floor;
    Direction dir;
    ExternalButtonDispatcher externalButtonDispatcher;

    ExternalButton(int floor) {
        this.floor = floor;
        externalButtonDispatcher = new ExternalButtonDispatcher();
    }

    public ElevatorController pressButton(Direction direction) {
        dir = direction;
        return externalButtonDispatcher.acceptRequest(floor, direction);
    }
}
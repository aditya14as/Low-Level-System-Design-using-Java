
public class InternalButton {
    // dispatcher
    InternalButtonDispatcher internalButtonDispatcher;

    InternalButton() {
        internalButtonDispatcher = new InternalButtonDispatcher();
    }

    public void pressButton(int destinationFloor, Elevator elevator) {
        internalButtonDispatcher.acceptRequest(destinationFloor, elevator);
    }
}

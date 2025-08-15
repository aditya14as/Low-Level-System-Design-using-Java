import java.util.*;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllers;

    InternalButtonDispatcher() {
        this.elevatorControllers = ElevatorCreator.elevatorControllers;
    }

    public ElevatorController acceptRequest(int floor, Elevator elevator) {
        // core logic should be there
        for (ElevatorController ec : elevatorControllers) {
            if (ec.elevator == elevator) {
                ec.acceptInternalRequest(floor);
                return ec;
            }
        }
        return null;
    }
}

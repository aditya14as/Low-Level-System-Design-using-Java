import java.util.*;

public class ExternalButtonDispatcher extends DispatcherStrategyA {
    List<ElevatorController> elevatorControllers = ElevatorCreator.elevatorControllers;

    public ElevatorController acceptRequest(int floor, Direction dir) {
        // Can implement best strategy to find best elevator and sends the request
        ElevatorController elevatorController = super.findBestElevator(elevatorControllers, floor);
        elevatorController.acceptExternalRequest(floor, dir);
        return elevatorController;
    }
}
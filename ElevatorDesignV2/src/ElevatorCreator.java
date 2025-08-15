import java.util.*;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllers = new ArrayList<>();
    static {
        Elevator elevator1 = new Elevator();
        ElevatorController elevatorController = new ElevatorController(elevator1);
        elevatorControllers.add(elevatorController);
        Elevator elevator2 = new Elevator();
        ElevatorController elevatorController2 = new ElevatorController(elevator2);
        elevatorControllers.add(elevatorController2);
    }
}

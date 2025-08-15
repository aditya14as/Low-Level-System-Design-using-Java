import java.util.*;

public interface DispatcherStrategy {
    public ElevatorController findBestElevator(List<ElevatorController> elevatorControllers, int floor);
}

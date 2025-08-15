import java.util.*;

public class DispatcherStrategyA implements DispatcherStrategy {

    @Override
    public ElevatorController findBestElevator(List<ElevatorController> eController, int floor) {
        // Implement any stretegy to assign best elevator
        return eController.get(0);
        // if (floor % 2 == 0) {
        // return eController.get(0);
        // } else {
        // return eController.get(1);
        // }
    }

}

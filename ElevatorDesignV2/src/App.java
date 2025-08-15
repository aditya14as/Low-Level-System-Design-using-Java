import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);
        Floor floor5 = new Floor(5);
        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        Building building = new Building(floorList);

        ElevatorController elevatorController = floor1.externalButton.pressButton(Direction.UP);
        elevatorController.elevator.internalButton.pressButton(5, elevatorController.elevator);

        elevatorController.elevator.internalButton.pressButton(3, elevatorController.elevator); // Check this

        elevatorController.controlElevator();
    }
}

import java.util.*;

public class ElevatorController {
    Elevator elevator;
    PriorityQueue<Integer> uppQueue = new PriorityQueue<>();
    PriorityQueue<Integer> downQueue = new PriorityQueue<>((a, b) -> b - a);
    Set<Integer> pendingjob = new HashSet<>();

    ElevatorController(Elevator elevator) {
        this.elevator = elevator;
    }

    public void acceptExternalRequest(int floor, Direction direction) {
        if (direction == Direction.UP) {
            if (elevator.direction == Direction.UP) {
                if (elevator.currentFloor <= floor) {
                    uppQueue.add(floor);
                } else {
                    pendingjob.add(floor);
                }
            } else {
                if (elevator.currentFloor <= floor) {
                    pendingjob.add(floor);
                } else {
                    downQueue.add(floor);
                }
            }
        } else {
            if (elevator.direction == Direction.DOWN) {

            } else {
                uppQueue.add(floor);
            }
        }
    }

    public void acceptInternalRequest(int floor) {
        if (elevator.direction == Direction.UP) {
            if (elevator.currentFloor <= floor) {
                uppQueue.add(floor);
            } else {
                pendingjob.add(floor);
            }
        } else {
            if (elevator.currentFloor <= floor) {
                pendingjob.add(floor);
            } else {
                downQueue.add(floor);
            }
        }
    }

    public void controlElevator() {
        while (true) {
            if (elevator.direction == Direction.UP) {
                while (uppQueue.size() > 0) {
                    elevator.move(Direction.UP, uppQueue.poll());
                }
                elevator.direction = Direction.DOWN;
                Iterator<Integer> itr = pendingjob.iterator();
                while (itr.hasNext()) {
                    int i = itr.next();
                    uppQueue.add(i);
                    pendingjob.remove(i);
                }
            }
            if (elevator.direction == Direction.DOWN) {
                while (downQueue.size() > 0) {
                    elevator.move(Direction.DOWN, downQueue.poll());
                }
                elevator.direction = Direction.UP;
                Iterator<Integer> itr = pendingjob.iterator();
                while (itr.hasNext()) {
                    int i = itr.next();
                    downQueue.add(i);
                    pendingjob.remove(i);
                }
            }
        }
    }
}

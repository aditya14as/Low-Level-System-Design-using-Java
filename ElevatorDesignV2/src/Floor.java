public class Floor {
    ExternalButton externalButton;
    int floor;

    Floor(int floor) {
        this.floor = floor;
        externalButton = new ExternalButton(floor);
    }
}

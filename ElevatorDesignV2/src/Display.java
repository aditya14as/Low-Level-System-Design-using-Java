public class Display {
    int floor;
    Direction dir;

    Display(int floor, Direction dir) {
        this.floor = floor;
        this.dir = dir;
    }

    public void setDisplay(int floor, Direction dir) {
        this.floor = floor;
        this.dir = dir;
    }

    public void show() {
        System.out.println("Floor num:" + floor + " with direction:" + dir);
    }
}

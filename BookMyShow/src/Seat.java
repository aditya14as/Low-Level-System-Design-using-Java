import enums.*;

public class Seat {
    int id;
    int row;
    SeatCategory category;
    int price;

    Seat(int id, int row, SeatCategory category, int price) {
        this.id = id;
        this.row = row;
        this.category = category;
        this.price = price;
    }
    // Getters, Setters
}

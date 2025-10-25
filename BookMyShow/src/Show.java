import java.util.*;

public class Show {
    int id;
    Movie movie;
    Screen screen;
    int startTime;
    List<Seat> bookedSeats;

    Show(int id, Movie movie, Screen screen, int startTime, List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
        this.id = id;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
    }

}

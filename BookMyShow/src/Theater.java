import java.util.*;

public class Theater {
    int id;
    String name;
    String address; // make it another entity
    List<Show> shows;

    Theater(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    // getters and setters
}

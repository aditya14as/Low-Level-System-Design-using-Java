public class Movie {
    int id;
    String name;
    int duration;

    Movie(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return this.name;
    }

    public int getDuration() {
        return this.duration;
    }
}

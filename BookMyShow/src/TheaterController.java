import java.util.*;

public class TheaterController {
    Map<String, List<Theater>> cityTheaterMap;
    List<Theater> theaters;

    TheaterController() {
        cityTheaterMap = new HashMap<>();
        theaters = new ArrayList<>();
    }

    public void setTheater(String city, Theater theater) {
        theaters.add(theater);
        List<Theater> theatersOfCity = cityTheaterMap.getOrDefault(city, new ArrayList<>());
        theatersOfCity.add(theater);
    }

    public List<Theater> getTheatersOfCity(String city) {
        return cityTheaterMap.get(city);
    }

    public List<Theater> getAllTheaters() {
        return theaters;
    }
    // getAllTheater in a city which run a movie
    
}

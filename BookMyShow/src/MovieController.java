import java.util.*;

public class MovieController {
    Map<String, List<Movie>> cityMovieMap;
    List<Movie> movies;

    MovieController() {
        cityMovieMap = new HashMap<>();
        movies = new ArrayList<>();
    }

    public void setMovie(String city, Movie movie) {
        movies.add(movie);
        List<Movie> moviesOfCity = cityMovieMap.getOrDefault(city, new ArrayList<>());
        moviesOfCity.add(movie);
    }

    public List<Movie> getMovieOfCity(String city) {
        return cityMovieMap.get(city);
    }

    public List<Movie> getAllMovie() {
        return movies;
    }
    //getMovieByName

}   

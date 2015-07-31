import java.util.ArrayList;
import java.util.List;

/**
 * Created by ishaani on 31/7/15.
 */
public class Moviecart {

    List<RentalObject> movies = new ArrayList<RentalObject>();

    public void addMovie(RentalObject movie){
        movies.add(movie);
    }

    public List<RentalObject> getMovies() {
        return movies;
    }
}

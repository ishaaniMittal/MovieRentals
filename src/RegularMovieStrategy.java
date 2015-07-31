/**
 * Created by ishaani on 31/7/15.
 */
public class RegularMovieStrategy extends RentalStrategy {

    private static final double RENT_PER_MOVIE = 3;
    @Override
    public double calculateRent(double noOfDays) {
        return RENT_PER_MOVIE;
    }

    @Override
    public double calculatePoints(double noOfDays) {
        return RENT_PER_MOVIE;
    }
}

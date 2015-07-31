/**
 * Created by ishaani on 31/7/15.
 */
public class RentalObject {

    private RentalStrategy movieType;
    private double noOfDaysForRent;

    public RentalObject(RentalStrategy movieType, double noOfDaysForRent) {
        this.movieType = movieType;
        this.noOfDaysForRent = noOfDaysForRent;
    }

    public double getNoOfDaysForRent() {
        return noOfDaysForRent;
    }

    public RentalStrategy getMovieType() {
        return movieType;
    }
}

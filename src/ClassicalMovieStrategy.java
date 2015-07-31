/**
 * Created by ishaani on 31/7/15.
 */
public class ClassicalMovieStrategy extends RentalStrategy {

    private static final double RENT_PER_DAY = 0.5;
    private static final double RENT_PER_WEEK = 3;

    @Override
    public double calculateRent(double noOfDays) {
        return ((double) (noOfDays/7) *RENT_PER_WEEK + (double) (noOfDays%7) *RENT_PER_DAY);
    }

    @Override
    public double calculatePoints(double noOfDays) {
        return calculateRent(noOfDays);
    }
}

/**
 * Created by ishaani on 31/7/15.
 */
public class NewMovieStrategy extends RentalStrategy {

    private static final double FIRST_TWO_DAYS = 3;
    private static final double RENT_PER_DAY = 3;

    @Override
    public double calculateRent(double noOfDays) {
        return (FIRST_TWO_DAYS + (noOfDays-2)*RENT_PER_DAY);
    }

    @Override
    public double calculatePoints(double noOfDays) {
        return (noOfDays*2);
    }
}

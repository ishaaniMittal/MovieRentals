import java.util.ArrayList;
import java.util.List;

/**
 * Created by ishaani on 31/7/15.
 */
public class Shopkeeper {

    private Moviecart moviecart;
    private List<Customer> customerList = new ArrayList<>();

    public Shopkeeper(Moviecart moviecart,Customer cust){
        this.moviecart = moviecart;
        customerList.add(cust);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public double calculateTotalRental(){
        double Amount = 0;
        for(RentalObject movie : moviecart.getMovies()){
            Amount += movie.getMovieType().calculateRent(movie.getNoOfDaysForRent());
        }
        return Amount;
    }

    public double calculateTotalPoints(){
        double points = 0;
        for(RentalObject movie : moviecart.getMovies()){
            points += movie.getMovieType().calculatePoints(movie.getNoOfDaysForRent());
        }
        return points;
    }

}

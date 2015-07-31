import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ishaani on 31/7/15.
 */
public class ShopkeeperTest {

    @Test
    public void getTotalRentalAmount(){

        Moviecart moviecart = new Moviecart();
        RentalObject obj1 = new RentalObject(new NewMovieStrategy(),2);
        RentalObject obj2 = new RentalObject(new ClassicalMovieStrategy(),7);
        RentalObject obj3 = new RentalObject(new RegularMovieStrategy(),7);
        moviecart.addMovie(obj1);
        moviecart.addMovie(obj2);
        moviecart.addMovie(obj3);
        Customer customer1 = new Customer("Ishaani");
        Shopkeeper shopkeeper = new Shopkeeper(moviecart,customer1);
        assertEquals(9.0, shopkeeper.calculateTotalRental(), 2);
    }

    @Test
    public void getTotalPoints(){
        Moviecart moviecart = new Moviecart();
        RentalObject obj1 = new RentalObject(new NewMovieStrategy(),2);
        RentalObject obj2 = new RentalObject(new ClassicalMovieStrategy(),7);
        RentalObject obj3 = new RentalObject(new RegularMovieStrategy(),7);
        moviecart.addMovie(obj1);
        moviecart.addMovie(obj2);
        moviecart.addMovie(obj3);
        Customer customer1 = new Customer("Ishaani");
        Shopkeeper shopkeeper = new Shopkeeper(moviecart,customer1);
        assertEquals(10, shopkeeper.calculateTotalPoints(), 2);
    }

    @Test
    public void getCustomersForAShopkeeper(){
        Moviecart moviecart = new Moviecart();
        RentalObject obj1 = new RentalObject(new NewMovieStrategy(),2);
        RentalObject obj2 = new RentalObject(new ClassicalMovieStrategy(),7);
        RentalObject obj3 = new RentalObject(new RegularMovieStrategy(),7);
        moviecart.addMovie(obj1);
        moviecart.addMovie(obj2);
        moviecart.addMovie(obj3);
        Customer customer1 = new Customer("Ishaani");
        Shopkeeper shopkeeper = new Shopkeeper(moviecart,customer1);
        System.out.println(shopkeeper.getCustomerList());
    }

}
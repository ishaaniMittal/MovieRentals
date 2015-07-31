import java.util.ArrayList;
import java.util.List;

/**
 * Created by ishaani on 31/7/15.
 */
public class Customer {

    private String custName;
    private List<Receipt> receipts = new ArrayList<Receipt>();

    public Customer(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custName + '\'' +
                '}';
    }
}

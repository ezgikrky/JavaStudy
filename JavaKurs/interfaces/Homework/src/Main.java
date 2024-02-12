import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager= new NeroCustomerManager();
        customerManager.save(new Customer(1, "Ezgi", "Karakaya", new Date(2000,4,9), "123456"));


    }
}
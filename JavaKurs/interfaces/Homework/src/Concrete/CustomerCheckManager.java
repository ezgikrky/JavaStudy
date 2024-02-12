package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    // bu sınıf herhangi bir kontrol olmaksızın true dondürsün. yani mernis kullanmasın
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
  }

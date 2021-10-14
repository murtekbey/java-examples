package javaCampFourthDay.business.concretes;

import javaCampFourthDay.adapters.CustomerCheckService;
import javaCampFourthDay.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}


}

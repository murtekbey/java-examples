package javaCampFourthDay.adapters;

import javaCampFourthDay.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}

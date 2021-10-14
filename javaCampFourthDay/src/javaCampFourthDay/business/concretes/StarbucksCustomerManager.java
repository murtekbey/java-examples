package javaCampFourthDay.business.concretes;

import javaCampFourthDay.adapters.CustomerCheckService;
import javaCampFourthDay.business.abstracts.BaseCustomerManager;
import javaCampFourthDay.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: " + customer.getFirstName());
		} else {
			System.out.println("Not a valid user");
		}
	}

}

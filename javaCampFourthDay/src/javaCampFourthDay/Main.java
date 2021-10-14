package javaCampFourthDay;
import javaCampFourthDay.adapters.MernisServiceAdapter;
import javaCampFourthDay.business.abstracts.BaseCustomerManager;
import javaCampFourthDay.business.concretes.StarbucksCustomerManager;
import javaCampFourthDay.entities.concretes.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Murat", "Altýnpýnar", 1111, "11111111111"));
	}

}

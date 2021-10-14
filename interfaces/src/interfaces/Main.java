package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(), new EmailLogger(), new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer = new Customer(1, "Murat", "Altýnpýnar");
		customerManager.add(customer);
	}

}

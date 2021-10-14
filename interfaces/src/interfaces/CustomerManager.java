package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getFullName());
		Utils.RunLogger(loggers, customer.getFullName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: " + customer.getFullName());
		Utils.RunLogger(loggers, customer.getFullName());
	}
}

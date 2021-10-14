package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi: " + customer.getFullName());
		Utils.RunLogger(loggers, customer.getFullName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi: " + customer.getFullName());
		Utils.RunLogger(loggers, customer.getFullName());
	}
}

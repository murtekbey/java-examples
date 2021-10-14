package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer murat = new IndividualCustomer();
		murat.id = 1;
		murat.customerNumber = "1234";
		murat.firstName = "Murat";
		murat.lastName = "ALTINPINAR";
		murat.nationalIdentity = "11111111111";
		
		CoorporateCustomer hepsiBurada = new CoorporateCustomer();
		hepsiBurada.id = 2;
		hepsiBurada.customerNumber = "2134";
		hepsiBurada.companyName = "Hepsi Burada";
		hepsiBurada.taxNumber = "1000000000";
		
		UnionCustomer abc = new UnionCustomer();
		abc.id = 3;
		abc.customerNumber = "4321";
		abc.unionNumber = "999";

		// Polymorphism 
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada); // Polymorphism 
		//customerManager.add(murat); // Polymorphism
		//customerManager.add(abc);
		
		Customer[] customers = {murat, hepsiBurada, abc};
		
		customerManager.addMultiple(customers);
		
		// Individual ve Coorporate Customerlar base class olan Customer sýnýfýný extend ettiklerinden dolayý
		// CustomerManager'a parametre olarak Customeri gönderdiðimizde, 
		// Customer hem Individual hem de Coorporate sýnýflarýnýn referanslarýný tutabilir.
	}

}

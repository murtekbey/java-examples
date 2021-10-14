package eCommerceJavaCamp;

import eCommerceJavaCamp.business.abstracts.UserService;
import eCommerceJavaCamp.business.concretes.UserManager;
import eCommerceJavaCamp.core.entities.concretes.User;
import eCommerceJavaCamp.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new HibernateUserDao());
		
		User user = new User(1,"Gurur", "Altýnpýnar", "gurtekbey@gmail.com", "123456");
		userService.add(user);
	}

}

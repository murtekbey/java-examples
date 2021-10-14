package javaCampFifthDay;

import javaCampFifthDay.adapters.authorizationProvider.googleAuthorization.GoogleAuthorizationAdapter;
import javaCampFifthDay.adapters.confirmationMail.ConfirmationMailAdapter;
import javaCampFifthDay.business.abstracts.UserService;
import javaCampFifthDay.business.concretes.UserManager;
import javaCampFifthDay.business.validators.UserValidator;
import javaCampFifthDay.core.entities.concretes.User;
import javaCampFifthDay.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Murat","Altýnpýnar","murata@gmail.com","123456");
		UserService userService = new UserManager(
				new HibernateUserDao(), 
				new UserValidator(), 
				new GoogleAuthorizationAdapter(),
				new ConfirmationMailAdapter()
				);
		userService.registerWithGoogleService(user);
		
		userService.login(user);
	}

}

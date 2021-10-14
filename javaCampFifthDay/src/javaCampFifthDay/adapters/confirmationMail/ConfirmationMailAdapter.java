package javaCampFifthDay.adapters.confirmationMail;

import javaCampFifthDay.core.entities.concretes.User;

public class ConfirmationMailAdapter implements ConfirmationMailService {

	@Override
	public boolean confirmUser(User user) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Your mail is being verified..");
			Thread.sleep(2000);
			System.out.println(user.getEmail() + " is verified.");
			return true;
		} catch (Exception e) {
			System.out.println("Something went wrong, try again.");
			return false;
		}
	}

}

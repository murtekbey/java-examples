package javaCampFifthDay.business.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampFifthDay.core.entities.concretes.User;

public class UserValidator implements UserValidatorService {

	public boolean validateUser(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr.");
			return false;
		}
		if (validateEmail(user.getEmail()) == false) {
			System.out.println("Email is not valid.");
			return false;
		}
		if ((user.getFirstName().length() < 2) || (user.getLastName().length() < 2)) {
			System.out.println("Adýnýz ve soyadýnýz en az 2 karakterden oluþmalýdýr");
			return false;
		}
		
		return true;
	}
	
	private boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches() ? true : false;
	}
}

package javaCampFifthDay.adapters.confirmationMail;

import javaCampFifthDay.core.entities.concretes.User;

public interface ConfirmationMailService {
	public boolean confirmUser(User user);
}

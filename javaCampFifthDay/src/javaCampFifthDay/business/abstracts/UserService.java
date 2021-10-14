package javaCampFifthDay.business.abstracts;

import javaCampFifthDay.core.entities.concretes.User;

public interface UserService {
	void register(User user);
	void registerWithGoogleService(User user);
	User getByEmail(String email);
	void login(User user);
}

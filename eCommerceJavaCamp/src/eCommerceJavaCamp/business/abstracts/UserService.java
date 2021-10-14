package eCommerceJavaCamp.business.abstracts;

import java.util.List;

import eCommerceJavaCamp.core.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}

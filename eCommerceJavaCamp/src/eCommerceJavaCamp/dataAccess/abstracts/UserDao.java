package eCommerceJavaCamp.dataAccess.abstracts;

import java.util.List;

import eCommerceJavaCamp.core.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}

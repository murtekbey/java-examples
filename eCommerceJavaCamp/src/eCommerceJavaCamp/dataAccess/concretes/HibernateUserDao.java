package eCommerceJavaCamp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceJavaCamp.core.entities.concretes.User;
import eCommerceJavaCamp.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {
	
	List<User> users;
	
	public HibernateUserDao() {
		users = new ArrayList<User>();
		users.add(new User(1,"Murat","Alt�np�nar","murtekbey@gmail.com","123456"));
		users.add(new User(2,"An�l","Koralay","anlkoralay@hotmail.com","123456"));
		users.add(new User(3,"Efe","�zcan","efeozcn@yahoo.com","123456"));
		users.add(new User(4,"S�leyman","Yaka","sulymnyaka@gmail.com","123456"));
		users.add(new User(5,"Mustafa","�a�atay","badoes@hotmail.com","123456"));
		users.add(new User(6,"Mustafa","G�ndo�du","mukellef@gmail.com","123456"));
		
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.getFullName() + " isimli kullan�c� eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFullName() + " isimli kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFullName() + " isimli kullan�c� silindi.");
		
	}

	@Override
	public User get(int id) {
		for (User i : users) {
			if (i.getId() == id) {
				return i;
			}
		}
		System.out.println("Bu id numaras�na sahip bir kullan�c� bulunamad�.");
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}

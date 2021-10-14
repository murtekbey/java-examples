package eCommerceJavaCamp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceJavaCamp.core.entities.concretes.User;
import eCommerceJavaCamp.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {
	
	List<User> users;
	
	public HibernateUserDao() {
		users = new ArrayList<User>();
		users.add(new User(1,"Murat","Altýnpýnar","murtekbey@gmail.com","123456"));
		users.add(new User(2,"Anýl","Koralay","anlkoralay@hotmail.com","123456"));
		users.add(new User(3,"Efe","Özcan","efeozcn@yahoo.com","123456"));
		users.add(new User(4,"Süleyman","Yaka","sulymnyaka@gmail.com","123456"));
		users.add(new User(5,"Mustafa","Çaðatay","badoes@hotmail.com","123456"));
		users.add(new User(6,"Mustafa","Gündoðdu","mukellef@gmail.com","123456"));
		
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.getFullName() + " isimli kullanýcý eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFullName() + " isimli kullanýcý güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFullName() + " isimli kullanýcý silindi.");
		
	}

	@Override
	public User get(int id) {
		for (User i : users) {
			if (i.getId() == id) {
				return i;
			}
		}
		System.out.println("Bu id numarasýna sahip bir kullanýcý bulunamadý.");
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}

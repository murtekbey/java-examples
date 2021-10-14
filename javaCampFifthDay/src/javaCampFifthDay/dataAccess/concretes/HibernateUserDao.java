package javaCampFifthDay.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCampFifthDay.core.entities.concretes.User;
import javaCampFifthDay.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {
	
	private static List<User> users = new ArrayList<>();
	
	public HibernateUserDao() {
		users.add(new User(1,"Murat","Altýnpýnar","murat@gmail.com", "123456"));
		users.add(new User(2,"Anýl","Koralay","anil@gmail.com", "123456"));
		users.add(new User(3,"Efe","Özcan","efe@gmail.com", "123456"));
		users.add(new User(4,"Mustafa","Gündoðdu","mustafa@gmail.com", "123456"));
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate ile eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}

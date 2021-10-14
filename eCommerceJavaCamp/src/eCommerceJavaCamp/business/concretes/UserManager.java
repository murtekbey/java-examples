package eCommerceJavaCamp.business.concretes;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import eCommerceJavaCamp.business.abstracts.UserService;
import eCommerceJavaCamp.core.entities.concretes.User;
import eCommerceJavaCamp.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
	
	private UserDao userDao;
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(user.getEmail());
		boolean anyMatch = matcher.find();
		
		if (anyMatch == false) {
			System.out.println("Lütfen geçerli bir email adresi girin.");
			return;
		}
		
		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return;
		}
		
		if (user.getFirstName().length() < 2 && user.getLastName().length() < 2)  {
			System.out.println("Adýnýz ve Soyadýnýz en az 2 karakterden oluþmalýdýr.");
			return;
		}
		
		for (User i: userDao.getAll()) {
			if (i.getEmail() == user.getEmail()) {
				System.out.println("Bu e-mail adresi kullanýlýyor.");
				return;
			}
		}
		
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}

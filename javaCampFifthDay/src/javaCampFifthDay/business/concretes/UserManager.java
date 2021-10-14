package javaCampFifthDay.business.concretes;

import java.util.List;

import javaCampFifthDay.adapters.authorizationProvider.AuthorizationProviderService;
import javaCampFifthDay.adapters.confirmationMail.ConfirmationMailService;
import javaCampFifthDay.business.abstracts.UserService;
import javaCampFifthDay.business.validators.UserValidatorService;
import javaCampFifthDay.core.entities.concretes.User;
import javaCampFifthDay.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserValidatorService userValidatorService;
	private AuthorizationProviderService authorizationService;
	private ConfirmationMailService mailService;
	
	public UserManager(UserDao userDao, UserValidatorService userValidatorService, AuthorizationProviderService authorizationService, ConfirmationMailService mailService) {
		super();
		this.userDao = userDao;
		this.userValidatorService = userValidatorService;
		this.authorizationService = authorizationService;
		this.mailService = mailService;
	}

	@Override
	public void register(User user) {
		if (!this.userValidatorService.validateUser(user)) {
			System.out.println("Validation error.");
			return;
		}
		
		if (getByEmail(user.getEmail()) != null) {
			System.out.println("Bu email adresi daha �nce kullan�lm��");
			return;
		}
		
		this.userDao.add(user);
		System.out.println("Kay�t ba�ar�l� do�rulama linki mail adresine g�nderildi.");
		
		if (mailService.confirmUser(user)) {
			System.out.println("Do�rulama tamamland�");
		} else {
			System.out.println("Do�rulama ba�ar�s�z");
		}
	}

	@Override
	public User getByEmail(String email) {
		for(User user : this.userDao.getAll()) {
			if (user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void registerWithGoogleService(User user) {
		if (getByEmail(user.getEmail()) != null) {
			System.out.println("Bu email adresi daha �nce kullan�lm��");
			return;
		}
		
		if (authorizationService.getUser(user) == null) {
			System.out.println("Authorization failed");
			return;
		}
		
		this.userDao.add(user);
		
		if (mailService.confirmUser(user)) {
			System.out.println("Do�rulama tamamland�");
		} else {
			System.out.println("Do�rulama ba�ar�s�z");
		}
		
		System.out.println("Google hesab�n�z ile ba�ar�yla �ye oldunuz");
	}

	@Override
	public void login(User user) {
		List<User> users = this.userDao.getAll();
		for(User checkUser : users) {
			if (checkUser.getEmail() == user.getEmail() && checkUser.getPassword() == user.getPassword()) {
				System.out.println("Giri� ba�ar�l�");
				return;
			}
		}
		System.out.println("Kullan�c� ad� ya da �ifreniz hatal�.");
	}

}

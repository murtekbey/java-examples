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
			System.out.println("Bu email adresi daha önce kullanýlmýþ");
			return;
		}
		
		this.userDao.add(user);
		System.out.println("Kayýt baþarýlý doðrulama linki mail adresine gönderildi.");
		
		if (mailService.confirmUser(user)) {
			System.out.println("Doðrulama tamamlandý");
		} else {
			System.out.println("Doðrulama baþarýsýz");
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
			System.out.println("Bu email adresi daha önce kullanýlmýþ");
			return;
		}
		
		if (authorizationService.getUser(user) == null) {
			System.out.println("Authorization failed");
			return;
		}
		
		this.userDao.add(user);
		
		if (mailService.confirmUser(user)) {
			System.out.println("Doðrulama tamamlandý");
		} else {
			System.out.println("Doðrulama baþarýsýz");
		}
		
		System.out.println("Google hesabýnýz ile baþarýyla üye oldunuz");
	}

	@Override
	public void login(User user) {
		List<User> users = this.userDao.getAll();
		for(User checkUser : users) {
			if (checkUser.getEmail() == user.getEmail() && checkUser.getPassword() == user.getPassword()) {
				System.out.println("Giriþ baþarýlý");
				return;
			}
		}
		System.out.println("Kullanýcý adý ya da þifreniz hatalý.");
	}

}

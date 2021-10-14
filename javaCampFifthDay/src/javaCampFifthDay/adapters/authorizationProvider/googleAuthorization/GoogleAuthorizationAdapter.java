package javaCampFifthDay.adapters.authorizationProvider.googleAuthorization;

import javaCampFifthDay.core.entities.concretes.User;

public class GoogleAuthorizationAdapter implements GoogleAuthorizationService {

	@Override
	public User getUser(User user) {
		try {
			System.out.println("Google authorization service is working now..");
			for (int i=5;i > 0; i--) {
				Thread.sleep(1000);
				System.out.println(i);
			}
			System.out.println("Authorization is success!");
			return user;
		} catch (Exception e) {
			System.out.println("Something wrong.. try again.");
			return null;
		}
	}

}

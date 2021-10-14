package adapters;

import entities.concretes.Player;

public interface PlayerCheckService {
	boolean checkIfRealPerson(Player player);
}

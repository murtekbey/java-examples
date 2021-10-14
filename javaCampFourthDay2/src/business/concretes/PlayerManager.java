package business.concretes;

import java.util.List;

import adapters.PlayerCheckService;
import business.abstracts.PlayerService;
import entities.concretes.Player;

public class PlayerManager implements PlayerService {
	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (this.playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Oyuncu eklendi: " + player.getFirstName());
		} else {
			System.out.println("Doðrulama baþarýsýz");
		}
	}

	@Override
	public void update(Player player) {
		if (this.playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Oyuncu güncellendi: " + player.getFirstName());
		} else {
			System.out.println("Doðrulama baþarýsýz");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi: " + player.getFirstName());
	}

	@Override
	public List<Player> getAll() {
		System.out.println("Oyuncular getirildi.");
		return null;
	}

	@Override
	public Player getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

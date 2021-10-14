package business.concretes;

import java.util.List;

import business.abstracts.GameService;
import entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getGameName());
	}

	@Override
	public List<Game> getAll() {
		System.out.println("Oyunlar getirildi");
		return null;
	}

	@Override
	public Game getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

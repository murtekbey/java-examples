package business.abstracts;

import java.util.List;

import entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	List<Game> getAll();
	Game getById(int id);
}

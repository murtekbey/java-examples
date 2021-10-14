import entities.concretes.Order;
import entities.concretes.Player;

import java.util.Date;

import adapters.MernisServiceAdapter;
import business.abstracts.OrderService;
import business.concretes.CampaignManager;
import business.concretes.OrderManager;
import business.concretes.PlayerManager;

public class Main {

	public static void main(String[] args) {
		OrderService orderService = new OrderManager(new CampaignManager());
		orderService.add(new Order(1, 1, 1, new Date(System.currentTimeMillis()), 1000));
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(new Player(1, "11111111111", "Murat", "Altýnpýnar", 1994));
	}

}

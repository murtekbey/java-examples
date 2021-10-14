package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import business.abstracts.OrderService;
import entities.concretes.Campaign;
import entities.concretes.Order;

public class OrderManager implements OrderService {
	
	CampaignService campaignService;
	
	public OrderManager() {
		
	}

	public OrderManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}
	
	@Override
	public void add(Order order) {
		Campaign campaign = campaignService.getById(order.getCampaignId());
		
		if (campaign != null) {
			order.setDiscountedPrice(order.getTotalPrice() - (order.getTotalPrice() * campaign.getDiscountRate() / 100));
			System.out.println("Oyun " + campaign.getCampaignName() + " kampanyasý uygulanarak baþarýyla satýn alýndý\n"
					+ "Ýndirimli fiyatý: " + order.getDiscountedPrice());
		} else {
			System.out.println("Oyun baþarýyla satýn alýndý.");
		}
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

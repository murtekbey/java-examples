package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	
	public CampaignManager() {
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
	}

	@Override
	public List<Campaign> getAll() {
		System.out.println("Kampanyalar getirildi");
		return null;
	}

	@Override
	public Campaign getById(int id) {
		return new Campaign(1, "Yeni oyuncu", "%25 indirim", 25);
	}

}

package entities.concretes;

import entities.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private String description;
	private int discountRate;
	
	public Campaign() {}
	
	public Campaign(int id, String campaignName, String description, int discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

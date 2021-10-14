package entities.concretes;

import java.util.Date;

public class Order {
	private int id;
	private int playerId;
	private int gameId;
	private int campaignId;
	private Date date;
	private double totalPrice;
	private double discountedPrice;
	
	public Order() {}
	
	public Order(int id, int playerId, int gameId, Date date, double totalPrice) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.gameId = gameId;
		this.date = date;
		this.totalPrice = totalPrice;
	}
	
	public Order(int id, int playerId, int gameId, int campaignId, Date date, double totalPrice,
			double discountedPrice) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.date = date;
		this.totalPrice = totalPrice;
		this.discountedPrice = discountedPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
}

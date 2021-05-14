package gameAssignment;

public class Campaign extends Game {
	
	String campaingName;
	double discount;
	
	
	public Campaign() {
		
	}
	public Campaign(String campaingName, double discount) {
		super();
		this.campaingName = campaingName;
		this.discount = discount;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}

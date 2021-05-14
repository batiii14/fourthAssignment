package gameAssignment;

public class Game extends GameManager {
	int id;
	String name;
	double price;
	
	public Game() {
		
	}

	public Game(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getpriceAfterDiscount(Campaign campaign) {
		return this.price- (this.price * campaign.discount/100);
	}
	
	

}

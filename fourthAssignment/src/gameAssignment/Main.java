package gameAssignment;

import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		
		Game game=new Game(1,"Mount & Blade Bannerlord",130);
		Gamer gamer=new Gamer(2,"BATUN","IDIKURT","abc@gmail.com","ADANA",LocalDate.of(1998, 02, 01),"11235461111");
		Campaign campaign=new Campaign("Bahar Kampanyasý",10);
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.addCampaing(campaign);
		GameManager gameManager =new GameManager();
		gameManager.deleteAccount(gamer);
		gameManager.newAccount(gamer);
		gameManager.updateInfo(gamer);
		
		
		
		
		GamerCheckService gamerCheckService=new GamerCheckService();
		if(gamerCheckService.checkIfRealPerson(gamer)==true) {
			SaleManager saleManager=new SaleManager();
			saleManager.buyGame(game, gamer, campaign);
		}else {
			System.out.println("There's no such a person!");
		}
		
		
		
		
		
		
		
	}

}

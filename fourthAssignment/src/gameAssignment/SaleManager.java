package gameAssignment;

public class SaleManager implements SaleService{
	
	
	@Override
	public void buyGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() +" adlý oyun "+ gamer.getFirstName() + " kiþisinin kütüphanesine "+ game.getpriceAfterDiscount(campaign)+ " fiyatý ile yüklenmiþtir"  );
	}

	@Override
	public void refundGame(Game game, Gamer gamer, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

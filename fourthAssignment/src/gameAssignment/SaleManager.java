package gameAssignment;

public class SaleManager implements SaleService{
	
	
	@Override
	public void buyGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() +" adl� oyun "+ gamer.getFirstName() + " ki�isinin k�t�phanesine "+ game.getpriceAfterDiscount(campaign)+ " fiyat� ile y�klenmi�tir"  );
	}

	@Override
	public void refundGame(Game game, Gamer gamer, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

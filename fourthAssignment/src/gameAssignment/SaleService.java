package gameAssignment;

public interface SaleService {
	
	void buyGame(Game game,Gamer gamer,Campaign campaign);
	
	void refundGame(Game game,Gamer gamer,Campaign campaign);

}

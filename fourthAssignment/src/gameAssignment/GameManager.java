package gameAssignment;

public class GameManager implements GameService{

	@Override
	public void newAccount(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sisteme ba�ar� ile kay�t olundu.");
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Hesab�n silindi ! Seni �zleyece�iz :(");
		
	}

	@Override
	public void updateInfo(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Bilgilerin Ba�ar� ile g�ncellendi!");
		
	}

	
	

}

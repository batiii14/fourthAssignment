package gameAssignment;

public class GameManager implements GameService{

	@Override
	public void newAccount(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Sisteme baþarý ile kayýt olundu.");
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Hesabýn silindi ! Seni özleyeceðiz :(");
		
	}

	@Override
	public void updateInfo(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Bilgilerin Baþarý ile güncellendi!");
		
	}

	
	

}

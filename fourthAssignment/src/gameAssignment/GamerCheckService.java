package gameAssignment;

public class GamerCheckService {
	
	public boolean checkIfRealPerson(Gamer gamer) {
		
		/*Mernis kullanmay� bilmiyorum o yuzden tc no uzer�nden gittim*/
		if(gamer.nationalityId.length()==11) {
			return true;
		}else {
			return false;
		}
	}

}

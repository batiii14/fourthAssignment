package gameAssignment;

public class GamerCheckService {
	
	public boolean checkIfRealPerson(Gamer gamer) {
		
		/*Mernis kullanmayı bilmiyorum o yuzden tc no uzerınden gittim*/
		if(gamer.nationalityId.length()==11) {
			return true;
		}else {
			return false;
		}
	}

}

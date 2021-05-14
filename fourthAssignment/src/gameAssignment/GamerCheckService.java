package gameAssignment;

public class GamerCheckService {
	
	public boolean checkIfRealPerson(Gamer gamer) {
		
		/*Mernis kullanmayý bilmiyorum o yuzden tc no uzerýnden gittim*/
		if(gamer.nationalityId.length()==11) {
			return true;
		}else {
			return false;
		}
	}

}

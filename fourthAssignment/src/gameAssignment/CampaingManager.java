package gameAssignment;

public class CampaingManager implements CampaignService{

	@Override
	public void addCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingName() +" Ba�ar� ile olu�turuldu");
	}

	@Override
	public void deleteCampaing(Campaign campaign) {
		System.out.println( campaign.getCampaingName() + " Ba�ar� ile silindi ");
		
	}
	
	

}

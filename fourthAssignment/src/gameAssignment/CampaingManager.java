package gameAssignment;

public class CampaingManager implements CampaignService{

	@Override
	public void addCampaing(Campaign campaign) {
		System.out.println(campaign.getCampaingName() +" Baþarý ile oluþturuldu");
	}

	@Override
	public void deleteCampaing(Campaign campaign) {
		System.out.println( campaign.getCampaingName() + " Baþarý ile silindi ");
		
	}
	
	

}

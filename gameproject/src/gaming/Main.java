package gaming;

public class Main {

	public static void main(String[] args) {
	
		CustomerManager customerManager = new CustomerManager();
		Customer bengisu = new Customer("1","Bengisu","Aksakal","02.07");
		customerManager.add(bengisu);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign("123");
		campaignManager.add(campaign1);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game("game1");
		gameManager.sell(game1, bengisu);
		
		
		// TODO Auto-generated method stub

	}

}

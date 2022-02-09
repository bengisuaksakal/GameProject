package gaming;

public class GameManager {
	public void sell(Game game, Customer customer) {
		System.out.println(game.getGameName() +" isimli oyun "+ customer.getFirstName()+" isimli müþteriye satýlmýþtýr"  );
	}

}

package BetMore_Game;

public class BetMore_Game {
	
	
	Shuffle s = new Shuffle();
	
	int a;
	
	
	public int pick_card() {
		
		
		a = s.randNum();
		
		return a;
	}

}

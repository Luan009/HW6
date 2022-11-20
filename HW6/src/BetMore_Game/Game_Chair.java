package BetMore_Game;

public class Game_Chair {
	
	
	
	public Player Computer = new Player();
	
	public Player Player_2 = new Player();
	
	
	BetMore_Game Bet = new BetMore_Game();
	
	
	
	
	
	
	public String result(Player Computer, Player Player_2) {
		
		return Bet.FindWinner(Computer, Player_2);
		
	}



}

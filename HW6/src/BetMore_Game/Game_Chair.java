package BetMore_Game;

public class Game_Chair {
	
	static BetMore_Game Bet = new BetMore_Game();
	static Player Computer = new Player();
	
	static Player Player_2 = new Player();
	
	
	
	
	public static void main(String[] args) {
		
		
		Computer.user_Selected = true;
		Player_2.user_Selected = false;
		
		Computer.Start();

		Player_2.Start();
		
		
		
		
		System.out.println(result());
		
		
	}
	
	
	
	
	
	public static String result() {
		
		return Bet.FindWinner(Computer, Player_2);
		
	}



}

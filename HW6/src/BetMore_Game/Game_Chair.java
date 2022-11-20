package BetMore_Game;

public class Game_Chair {
	
	
	
	public Player Computer = new Player();
	
	public Player Player_2 = new Player();
	
	
	BetMore_Game Bet = new BetMore_Game();
	
	
	public int Start(Player player) {
		
		int a = player.Play(player);
		
		
		return a;
		
		
	}
	
	public String FindWinner(Player Computer, Player Player_2) {
		
		int a = Computer.bet.a;
		
		int b = Player_2.bet.a;
		
		System.out.println("Number of Computer: " + a);
		
		System.out.println("Number of Player_2: " + b);

		
		
		if(a > b) {
			
			return "Winner: Computer";
			
		} else if(b > a) {
			
			return "Winner: Player_2";
		} else {
			
			return "Winner: Draw";
		}
		
	}

}

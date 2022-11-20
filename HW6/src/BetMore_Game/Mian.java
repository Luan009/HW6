package BetMore_Game;

public class Mian {
	
	
	public static void main(String[] args) {
		
		
		Game_Chair chair = new Game_Chair();
		
		Player Computer = new Player();
		
		Player Player_2 = new Player();
		
		chair.Start(Computer);
		
		chair.Start(Player_2);
		
		System.out.println(chair.FindWinner(Computer, Player_2));
		
		
	}

}

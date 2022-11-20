package BetMore_Game;

public class Mian {
	
	
	public static void main(String[] args) {
		
		
		Game_Chair chair = new Game_Chair();
		
		Player Computer = new Player();
		
		Player Player_2 = new Player();
		
		Computer.Start();

		Player_2.Start();
		
		
		
		
		System.out.println(chair.result(Computer, Player_2));
		
		
	}

}

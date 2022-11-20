package BetMore_Game;

import java.util.Scanner;

public class BetMore_Game {
	
	
	Shuffle s = new Shuffle();
	
	public boolean user_Selected;

	int x;
	
	
	
	
	public int Play() {
		
		x = s.pick_card();
		
				
		return x;
		
	}
	
	
public String FindWinner(Player Computer, Player Player_2) {
		
		int a = Computer.x;
		
		int b = Player_2.x;
		
		System.out.println("Number of Computer: " + Computer.x);
		
		System.out.println("Number of Player_2: " + Player_2.x);

		
		
		if(a > b) {
			
			return "Winner: Computer";
			
		} else if(b > a) {
			
			return "Winner: Player_2";
		} else {
			
			return "Winner: Draw";
		}
		
	}

	
	
	


}

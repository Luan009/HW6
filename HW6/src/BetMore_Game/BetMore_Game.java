package BetMore_Game;

import java.util.Scanner;

public class BetMore_Game {
	
	
	Shuffle s = new Shuffle();
	
	public boolean user_Selected;

	int x;
	
	
	
	
	public int Play() {
		
		x = s.pick_card();
		
		System.out.println("Your number: " + x);
		
		System.out.println("Bet on this number? 1 for yes, 2 for no");
		
		Scanner a = new Scanner(System.in);
		
		int t = a.nextInt();
		
		
		if(t == 1) {
			user_Selected = true;
		} else {
			user_Selected = false;
		}
		
		
		while(user_Selected == false) {
			
			for(int i = 0; i < 5; i++) {
				
				x = s.pick_card();
				
				System.out.println("Your new number: " + this.x);
				
				if(i == 4 && user_Selected == false) {
					System.out.println("Can't choose new number.");
					user_Selected = true;
					break;
				}
				
				Scanner b = new Scanner(System.in);
				System.out.println("Bet on this number? 1 for yes, 2 for no");
				
				int t1 = b.nextInt();
				
				
				
				if(t1 == 1) {
					user_Selected = true;
					break;
					
				} else {
					user_Selected = false;
					continue;
				}
				
				
			}
		
			
		}
		
		System.out.println("Your chosen number: " + x);
		
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

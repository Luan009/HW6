package BetMore_Game;

import java.util.Scanner;

public class Player {
	
	
	public boolean user_Selected;
	
	BetMore_Game bet = new BetMore_Game();
	
	public int Play(Player player) {
		
		int b = bet.pick_card();
		
		System.out.println("Your number: " + b);
		
		System.out.println("Bet on this number? 1 for yes, 2 for no");
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		
		if(t == 1) {
			user_Selected = true;
		} else {
			user_Selected = false;
		}
		
		
		while(user_Selected == false) {
			
			for(int i = 0; i < 5; i++) {
				
				b = bet.pick_card();
				
				System.out.println("Your new number: " + b);
				
				if(i == 4 && user_Selected == false) {
					System.out.println("Can't choose new number.");
					user_Selected = true;
					break;
				}
				
				Scanner s1 = new Scanner(System.in);
				System.out.println("Bet on this number? 1 for yes, 2 for no");
				
				int t1 = s1.nextInt();
				
				
				
				if(t1 == 1) {
					user_Selected = true;
					break;
					
				} else {
					user_Selected = false;
					continue;
				}
				
				
			}
		
			
		}
		
		System.out.println("Your chosen number: " + b);
		
		return b;

	}
	

}

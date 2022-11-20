package BetMore_Game;

import java.util.Scanner;

public class Player {
	
	
		public boolean user_Selected;
	
		BetMore_Game Bet = new BetMore_Game();
	
		int x;
	
		
		public int Start() {
		
		x = Bet.Play();
		
		
		if(user_Selected == false) {
		
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
				
				x = Bet.Play();
				
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
		
		} else {
			System.out.println("Computer has chosen a number");
		}
		
	
		return x;
	
	
		

	}
	

}

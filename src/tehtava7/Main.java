package tehtava7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Player player = new Player();
		while(true) {
			Pokemon pokemon = player.getPokemon();
			pokemon.stats();
			System.out.println("1 - ATTACK");
			System.out.println("2 - DEFEND");
			System.out.println("3 - RUN");
		//	System.out.println("5 - STATS");
			System.out.println("0 - QUIT GAME");
			System.out.print("Enter Selection: ");
			int selection = scan.nextInt();
			System.out.println("");
			if(selection == 0) {
				break;
			}
			
			if(selection == 1) {
				pokemon.attack();
			}
			
			if(selection == 2) {
				pokemon.defend();
			}
			
			if(selection == 3) {
				pokemon.run();
			}
			/*
			if(selection == 5) {
				pokemon.stats();
			}
			*/
			
		}
	}
}

package tehtava13;

import java.util.Random;

public class Bonus {

	Random rand = new Random();

	public int giveBonus(Pokemon pokemon) {
		int exp = 0;
		if (rand.nextInt(2) == 1) {
			exp = 2;
			if (pokemon.getName().contains("[Charizard]")) {
				
				exp = 40;
			} else if (pokemon.getName().contains("[Charmeleon]")) {
				exp = 15;
			}
			System.out.println("You were lucky and got " + exp + " extra exp.");
			return exp;
		}

		return exp;
	}

}

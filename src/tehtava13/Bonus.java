package tehtava13;

import java.util.Random;

public class Bonus implements Visitor {

	Random rand = new Random();

	public int visit(Charizard charizard) {
		int exp = 0;
		// TODO Auto-generated method stub
		if (rand.nextInt(2) == 1) {
			exp = 40;
			System.out.println("You were lucky and got " + exp + " extra Exp.");

		}
		return exp;
	}

	public int visit(Charmander charmander) {
		int exp = 0;
		// TODO Auto-generated method stub
		if (rand.nextInt(2) == 1) {
			exp = 2;
			System.out.println("You were lucky and got " + exp + " extra Exp.");
		}
		return exp;
	}

	public int visit(Charmeleon charmeleon) {
		int exp = 0;
		// TODO Auto-generated method stub
		if (rand.nextInt(2) == 1) {
			exp = 15;
			System.out.println("You were lucky and got " + exp + " extra Exp.");
		}
		return exp;
	}

}

package tehtava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RockPaperScissorsAI extends Game {

	public RockPaperScissorsAI() {

	}

	/**
	 * Säännöt 0 voittaa 1 Kivi voitaa Sakset. 1 voittaa 0 Sakset voittaa Paperin. 2
	 * voittaa 0 Paperi voitaa Kiven
	 */

	String[] vaihtoehdot = { "Kivi", "Sakset", "Paperi" };
	Random random = new Random();
	HashMap<Integer, Integer> pelaajat = new HashMap<>();
	List<String> voittajat = new ArrayList<String>();

	@Override
	void initializeGame() {
		int value = super.playersCount;
		for (int i = 0; i < value; i++) {
			pelaajat.put(i, 0);
		}

	}

	@Override
	void makePlay(int player) {
		int valinta = random.nextInt(3);
		pelaajat.put(player, valinta);

	}

	@Override
	boolean endOfGame() {
		boolean kivi = false;
		boolean paperi = false;
		boolean sakset = false;

		for (int valinta : pelaajat.values()) {
			if (valinta == 0) {
				kivi = true;
			} else if (valinta == 1) {
				sakset = true;
			} else {
				paperi = true;
			}
			if (kivi == true && paperi == true && sakset == true) {
				return false;
			}
		}
		if (kivi == true && sakset == true) {
			for (int pelaaja : pelaajat.keySet()) {
				if (pelaajat.get(pelaaja) == 0) {
					voittajat.add("Player" + pelaaja + " voitto valinta: " + vaihtoehdot[pelaajat.get(pelaaja)]);
				}
			}
			System.out.println("END GAME");
			return true;
		} else if (sakset == true && paperi == true) {
			for (int pelaaja : pelaajat.keySet()) {
				if (pelaajat.get(pelaaja) == 1) {
					voittajat.add("Player" + pelaaja + " voitto valinta: " + vaihtoehdot[pelaajat.get(pelaaja)]);
				}
			}
			System.out.println("END GAME");
			return true;
		} else if (paperi == true && kivi == true) {
			for (int pelaaja : pelaajat.keySet()) {
				if (pelaajat.get(pelaaja) == 2) {
					voittajat.add("Player" + pelaaja + " voitto valinta: " + vaihtoehdot[pelaajat.get(pelaaja)]);
				}
			}
			System.out.println("END GAME");
			return true;
		}

		return false;
	}

	@Override
	void printWinner() {
		System.out.println("Kaikki pelaajat:");
		for (int pelaaja : pelaajat.keySet()) {
			System.out.println("Player" + pelaaja + " arvo: " + vaihtoehdot[pelaajat.get(pelaaja)]);
		}
		System.out.println("\nVoittajat:");
		for (String voittaja : voittajat) {
			System.out.println(voittaja);
		}

	}
}

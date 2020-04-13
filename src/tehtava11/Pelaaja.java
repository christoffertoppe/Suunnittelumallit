package tehtava11;

import java.util.Random;

public class Pelaaja implements Runnable {

	private boolean veikkaus = true;
	private Random rand = new Random();
	public void run() {
		try {
			Arvuuttaja arvuuttaja = new Arvuuttaja();
			Arvuuttaja.Memento arvaus = arvuuttaja.liityPeliin();	
			
			while (veikkaus) {
				System.out.println("Pelaaja"+ Thread.currentThread().getId() + " syötä arvaus: ");
				int input = rand.nextInt(5)+1;
				veikkaus = arvuuttaja.arvaus(arvaus, input);

			}			
		} catch (Exception e) {
			System.out.println("Exception is caught.");
		}
	}
}

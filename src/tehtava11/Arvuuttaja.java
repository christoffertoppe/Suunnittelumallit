package tehtava11;

import java.util.Random;

public class Arvuuttaja {
	private int arvo;
	private String nimi;
	private Random rand = new Random();

	public Memento liityPeliin() {
		arvo = rand.nextInt(5) + 1;
		return new Memento(arvo);
	}

	public Memento saveToMemento() {
		System.out.println("Saving time to Memento");
		return new Memento(arvo);
	}

	public boolean arvaus(Memento memento, int arvaus) {
		// arvo = memento.getSavedValue();
		if (memento.getSavedValue() == arvaus) {
			System.out.println("Pelaaja" + Thread.currentThread().getId() + " arvasi oikein: " + arvaus);
			return false;
		} 
		System.out.println("Pelaaja" + Thread.currentThread().getId() + " arvasi v‰‰rin: " + arvaus);
		return true;
	}
	

	public static class Memento {
		private final int arvo;

		public Memento(int annettuArvo) {
			arvo = annettuArvo;
		}

		private int getSavedValue() {
			return arvo;
		}
	}
}

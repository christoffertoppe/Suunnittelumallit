package tehtava3;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
	private int hinta = 90;

	List<Laiteosa> osat = new ArrayList<Laiteosa>();

	@Override
	public int getHinta() {
		int kokonaishinta = 0;
		if (osat.size() > 0) {
			for (Laiteosa osa : osat) {
				kokonaishinta = kokonaishinta + osa.getHinta();
			}
		}
		kokonaishinta = hinta + kokonaishinta;
		return kokonaishinta;
	}

	@Override
	public String getNimi() {
		return "Emolevy";
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		osat.add(osa);
		System.out.println("Emolevyyn on lisätty: " + osa.getNimi());
	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		osat.remove(osa);
	}

	@Override
	public void listaaKaikki() {
		System.out.println("Emolevy " + hinta);
		for(Laiteosa osa : osat) {
			System.out.println(osa.getNimi() +" " + osa.getHinta());
		}
		
	}
}

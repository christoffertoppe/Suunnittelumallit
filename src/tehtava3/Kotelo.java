package tehtava3;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

	private int hinta = 150;

	List<Laiteosa> laiteosat = new ArrayList<Laiteosa>();
	private boolean emolevy = false;
	@Override
	public int getHinta() {
		int kokonaishinta = 0;
		if (laiteosat.size() > 0) {
			for (Laiteosa osa : laiteosat) {
				kokonaishinta = kokonaishinta + osa.getHinta();
			}
		}	
		kokonaishinta = hinta + kokonaishinta;
		return kokonaishinta;				
	}

	@Override
	public String getNimi() {
		return "Kotelo";
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		if (osa.getNimi().equalsIgnoreCase("emolevy")) {
			if (emolevy == false) {
				emolevy = true;
				laiteosat.add(osa);
				System.out.println("Emolevy lisätty");
			} else {
				System.out.println("Emolevy on jo lisätty koteloon.");
			}

		}  else {
			System.out.println("Koteloon voi ainoastaan lisätä emolevy");
		}

	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		laiteosat.remove(osa);
	}

	@Override
	public void listaaKaikki() {
		System.out.println("Kotelo " + hinta);
		for(Laiteosa osa : laiteosat) {
			osa.listaaKaikki();
		}
		
	}

}

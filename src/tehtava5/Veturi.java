package tehtava5;

import java.util.ArrayList;
import java.util.List;

public class Veturi {

	private static Veturi INSTANCE = null;
	private List<String> vaunut = new ArrayList<String>();

	private Veturi() {
	}

	public static synchronized Veturi getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Veturi();
		}
		return INSTANCE;
	}

	public void lisaaVaunu(String vaununnimi) {
		vaunut.add(vaununnimi);
	}

	public void poistaVaunu(String vaununnimi) {
		vaunut.remove(vaununnimi);
	}

	public void poistaVaunu(int index) {
		if (vaunut.size() - 1 >= index) {
			vaunut.remove(index);
		}
	}

	public void junanPituus() {
		System.out.println("Junassa on veturi ja " + vaunut.size() + " vaunua.");
	}

	public void junanSisalto() {
		System.out.println("Junassa on:");
		System.out.println("Veturi");
		for (String vaunu : vaunut) {
			System.out.println("Vaunu joka sis‰lt‰‰: " + vaunu);
		}
	}

}

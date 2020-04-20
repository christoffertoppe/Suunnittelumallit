package tehtava15;

public class Adapter {

	public int StringtoInt(String muutettava) {
		int arvo = 0;
		try {
			arvo = Integer.parseInt(muutettava);
			return arvo;
		} catch (Exception e) {
			System.out.println("Stringi ei ole mahdollista tehdä luvuksi.");
		}
		return arvo;
	}
}

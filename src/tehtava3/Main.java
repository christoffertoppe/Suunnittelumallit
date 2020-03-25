package tehtava3;

public class Main {

	public static void main(String[] args) {
		
		Laiteosa kotelo = new Kotelo();
		Laiteosa naytonOhjain = new NaytonOhjain();
		Laiteosa emolevy = new Emolevy();
		Laiteosa muisti = new Muistipiiri();
		Laiteosa verkkokortti = new Verkkokortti();
		Laiteosa prosessori = new Prosessori();
		

		
		emolevy.lisaaOsa(naytonOhjain);
		emolevy.lisaaOsa(muisti);
		emolevy.lisaaOsa(verkkokortti);
		emolevy.lisaaOsa(prosessori);
		System.out.println("\nkone maksaa: " + kotelo.getHinta());
		kotelo.lisaaOsa(emolevy);
		System.out.println("");
		kotelo.listaaKaikki();
		System.out.println("kone maksaa: " + kotelo.getHinta());
		emolevy.poistaOsa(verkkokortti);
		System.out.println("");
		kotelo.listaaKaikki();
		System.out.println("kone maksaa: " + kotelo.getHinta());		
		System.out.println("");
		kotelo.lisaaOsa(naytonOhjain);

	}

}

package tehtava10;

public class ToimitusJohtaja extends Esimies {

	public ToimitusJohtaja(Esimies esimies) {
		super(esimies);
		// TODO Auto-generated constructor stub
	}
	
	public void kasittele(Palkka palkka) {
		if(palkka.getPalkka() >= 5) {
			System.out.println("Toimitusjohtaja hyväksyy " + palkka.getPalkka() + "% palkan korotusta.");
		} else {
			super.kasittele(palkka);
		}
	}

}

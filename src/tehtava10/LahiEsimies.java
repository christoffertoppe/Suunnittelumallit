package tehtava10;

public class LahiEsimies extends Esimies {

	public LahiEsimies(Esimies esimies) {
		super(esimies);
		// TODO Auto-generated constructor stub
	}
	
	public void kasittele(Palkka palkka) {
		if(palkka.getPalkka() <= 2) {
			System.out.println("Lähiesimies hyväksyy " + palkka.getPalkka() + "% palkan korotusta.");
		} else {
			super.kasittele(palkka);
		}
	}

}

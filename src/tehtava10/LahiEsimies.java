package tehtava10;

public class LahiEsimies extends Esimies {

	public LahiEsimies(Esimies esimies) {
		super(esimies);
		// TODO Auto-generated constructor stub
	}
	
	public void kasittele(Palkka palkka) {
		if(palkka.getPalkka() <= 2) {
			System.out.println("L�hiesimies hyv�ksyy " + palkka.getPalkka() + "% palkan korotusta.");
		} else {
			super.kasittele(palkka);
		}
	}

}

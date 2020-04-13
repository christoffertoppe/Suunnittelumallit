package tehtava10;

public class YksikonPaalikko extends Esimies {

	public YksikonPaalikko(Esimies esimies) {
		super(esimies);
		// TODO Auto-generated constructor stub
	}

	public void kasittele(Palkka palkka) {
		if (palkka.getPalkka() > 2 && palkka.getPalkka() < 5) {
			System.out.println("Yksikön päälikkö hyväksyy " + palkka.getPalkka() + "% palkan korotusta.");
		} else {
			super.kasittele(palkka);
		}
	}

}

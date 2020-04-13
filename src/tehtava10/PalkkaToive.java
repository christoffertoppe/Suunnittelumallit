package tehtava10;

public class PalkkaToive {
	Esimies palkkatoive;
	
	public PalkkaToive() {
		toivottuPalkka();
	}
	
	private void toivottuPalkka() {
		palkkatoive = new LahiEsimies(new YksikonPaalikko(new ToimitusJohtaja(null)));
	}
	
	public void kasittele(Palkka palkka) {
		palkkatoive.kasittele(palkka);
	}
}

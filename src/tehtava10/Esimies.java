package tehtava10;

abstract class Esimies {

	private Esimies esimies;

	public Esimies(Esimies esimies) {
		this.esimies = esimies;
	};

	public void kasittele(Palkka palkka) {
		if (esimies != null)
			esimies.kasittele(palkka);
	};
}

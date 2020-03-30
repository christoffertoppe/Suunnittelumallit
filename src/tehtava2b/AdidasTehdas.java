package tehtava2b;

public class AdidasTehdas extends VaateTehdas {

	@Override
	public Vaate luoVaate(String vaatekappale) {
		if (vaatekappale.equalsIgnoreCase("kengät")
		||	vaatekappale.equalsIgnoreCase("kengat")			
				) {
			return new KengatAdidas();
		} else if (vaatekappale.equalsIgnoreCase("farkut")) {
			return new FarkutAdidas();
		} else if (vaatekappale.equalsIgnoreCase("paita")) {
			return new TpaitaAdidas();
		} else if (vaatekappale.equalsIgnoreCase("lippis")) {
			return new LippisAdidas();
		}
		return null;
	}
}

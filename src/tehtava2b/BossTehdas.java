package tehtava2b;

public class BossTehdas extends VaateTehdas{

	@Override
	public Vaate luoVaate(String vaatekappale) {
		if (vaatekappale.equalsIgnoreCase("kengät")
		||	vaatekappale.equalsIgnoreCase("kengat")	
		) {
			return new KengatBoss();
		} else if (vaatekappale.equalsIgnoreCase("farkut")) {
			return new FarkutBoss();
		} else if (vaatekappale.equalsIgnoreCase("paita")) {
			return new TpaitaBoss();
		} else if (vaatekappale.equalsIgnoreCase("lippis")) {
			return new LippisBoss();
		}
		return null;
	}
}


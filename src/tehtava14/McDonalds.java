package tehtava14;

public class McDonalds implements RavintolaBuilder{

	String hampurilainen = "";

	public void lisaaLeipa() {
		hampurilainen = hampurilainen + "Leipä\n";
		
	}

	@Override
	public void lisaaSalaatti() {
		hampurilainen = hampurilainen + "Salaatti\n";
		
	}

	@Override
	public void lisaaPihvi() {
		hampurilainen = hampurilainen + "Pihvi\n";
		
	}

	@Override
	public void lisaaTomaatti() {
		hampurilainen = hampurilainen + "Tomaatti\n";
		
	}

	@Override
	public void lisaaSuolakurkku() {
		hampurilainen = hampurilainen + "Suolakurkku\n";
		
	}

	@Override
	public void lisaaJuusto() {
		hampurilainen = hampurilainen + "Juusto\n";
		
	}

	@Override
	public void lisaaMajoneesi() {
		hampurilainen = hampurilainen + "Majoneesi\n";
		
	}

	@Override
	public void Ketsuppi() {
		hampurilainen = hampurilainen + "Ketsuppi\n";
		
	}
	
	public String getBurger() {
		return "McDonalds burgeri\n" + hampurilainen;
	}


}

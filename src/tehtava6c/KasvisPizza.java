package tehtava6c;

class KasvisPizza implements Pizza {
	
	private int hinta = 5;
	private String kuvaus = "KasvisPizza";
	public KasvisPizza() {
		
	}

	@Override
	public int hinta() {
		return hinta;
	}

	@Override
	public String kuvaile() {
		return kuvaus;
	}
}

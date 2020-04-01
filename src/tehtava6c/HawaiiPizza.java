package tehtava6c;

public class HawaiiPizza implements Pizza {
	
	private int hinta = 5;
	private String kuvaus = "HawaiiPizza";
	
	public HawaiiPizza() {
		kuvaus = "HawaiiPizza";
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

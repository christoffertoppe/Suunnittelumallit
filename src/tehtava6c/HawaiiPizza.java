package tehtava6c;

public class HawaiiPizza implements Pizza {
	
	private int hinta = 5;
	private String kuvaus = "HawaiiPizza";
	
	public HawaiiPizza() {
		kuvaus = "HawaiiPizza";
	}

	@Override
	public int hinta() {
		return 5;
	}

	@Override
	public String kuvaile() {
		return kuvaus;
	}

}

package tehtava6c;

public class LihaPizza implements Pizza {
	
	private int hinta = 5;
	private String kuvaus = "LihaPizza";
	public LihaPizza() {
		
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

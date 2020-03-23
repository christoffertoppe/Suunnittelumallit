package tehtava3;

public class NaytonOhjain implements Laiteosa {
	private int hinta = 100;
	
	@Override
	public int getHinta() {	
		
		return hinta;
	}

	@Override
	public String getNimi() {
		
		return "Näytönohjain";
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		
	}

	@Override
	public void poistaOsa(Laiteosa osa) {
			
	}

	@Override
	public void listaaKaikki() {
		// TODO Auto-generated method stub
		
	}

}

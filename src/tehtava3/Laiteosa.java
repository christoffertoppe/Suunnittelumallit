package tehtava3;

public interface Laiteosa {
	public int getHinta();
	public String getNimi();
	public void lisaaOsa(Laiteosa osa);
	public void poistaOsa(Laiteosa osa);
	public void listaaKaikki();
}

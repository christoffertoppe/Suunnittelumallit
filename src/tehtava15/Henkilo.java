package tehtava15;

public class Henkilo {
	String nimi;
	String ika;
	String pituus;
	String paino;
	
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getIka() {
		return ika;
	}
	public void setIka(String ika) {
		this.ika = ika;
	}
	public String getPituus() {
		return pituus;
	}
	public void setPituus(String pituus) {
		this.pituus = pituus;
	}
	public String getPaino() {
		return paino;
	}
	public void setPaino(String paino) {
		this.paino = paino;
	}
	
	public String toString() {
		return this.nimi + " on " + this.ika + " ikäinen ja " + this.pituus + " sentti pitkä. Hän painaa " + this.paino + " kiloa.";
	}
	
}



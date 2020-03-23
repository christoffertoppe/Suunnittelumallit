package tehtava2;

public class VaateSuunnittelija {
	public static VaateTehdas luoVaateMerkki(String merkki) {
		if(merkki.equalsIgnoreCase("adidas")) {
			return new AdidasTehdas();
		} else {
			return new BossTehdas();
		}
	}
}

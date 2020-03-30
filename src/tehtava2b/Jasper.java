package tehtava2b;

public class Jasper {
	public static VaateTehdas luoVaateMerkki(String merkki) {
		if(merkki.equalsIgnoreCase("adidas")) {
			return new AdidasTehdas();
		} else {
			return new BossTehdas();
		}
	}
}

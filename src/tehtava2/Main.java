package tehtava2;

public class Main {

	public static void main(String[] args) {
		
		VaateTehdas tehdas = VaateSuunnittelija.luoVaateMerkki("adidas");
		Vaate kengat = tehdas.luoVaate("keng‰t");
		Vaate housut = tehdas.luoVaate("farkut");
		Vaate paita = tehdas.luoVaate("paita");
		Vaate lippis = tehdas.luoVaate("lippis");
		
		System.out.println("Jasperilla on yll‰‰n:");
		kengat.esittele();
		housut.esittele();
		paita.esittele();
		lippis.esittele();
		
		System.out.println("\nJasper haluaa toiselta vaatemerkilt‰ vaatteita ja pyyt‰‰ vaatesuunittelijalta Boss merkkisi‰ vaatteita\n");
		
		tehdas = VaateSuunnittelija.luoVaateMerkki("boss");	
		kengat = tehdas.luoVaate("keng‰t");
		housut = tehdas.luoVaate("farkut");
		paita = tehdas.luoVaate("paita");
		lippis = tehdas.luoVaate("lippis");
		
		System.out.println("Jasperilla on yll‰‰n:");
		kengat.esittele();
		housut.esittele();
		paita.esittele();
		lippis.esittele();
	}
}

package tehtava2b;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		Class c = null;
		VaateTehdas tehdas = null;
		VaateTehdas tehdas2 = null;

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("./tehtava2b/tehdas.properties.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			// luetaan toteuttava tehdas properties-tiedostosta
			c = Class.forName(properties.getProperty("tehdasBoss"));
			tehdas = (VaateTehdas) c.newInstance();
			
			c = Class.forName(properties.getProperty("tehdasAdidas"));
			tehdas2 = (VaateTehdas) c.newInstance();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		Vaate kengat = tehdas.luoVaate("keng‰t");
		Vaate housut = tehdas.luoVaate("farkut");
		Vaate paita = tehdas.luoVaate("paita");
		Vaate lippis = tehdas.luoVaate("lippis");

		System.out.println("Jasperilla on yll‰‰n:");
		kengat.esittele();
		housut.esittele();
		paita.esittele();
		lippis.esittele();


		kengat = tehdas2.luoVaate("keng‰t");
		housut = tehdas2.luoVaate("farkut");
		paita = tehdas2.luoVaate("paita");
		lippis = tehdas2.luoVaate("lippis");

		System.out.println("\nJasperilla on yll‰‰n:");
		kengat.esittele();
		housut.esittele();
		paita.esittele();
		lippis.esittele();
	}
}

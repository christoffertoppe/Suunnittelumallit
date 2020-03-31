package tehtava6c;

public class Main {

	public static void main(String[] args) {
		//Pizza ilman täytteitä
		Pizza kasvisPizza = new KasvisPizza();
		System.out.println(kasvisPizza.kuvaus + ", maksaa: " + kasvisPizza.hinta() + "€");

		kasvisPizza = new Oliivi(kasvisPizza);
		kasvisPizza = new Ananas(kasvisPizza);
		kasvisPizza = new Tomaatti(kasvisPizza);	
		System.out.println(kasvisPizza.kuvaile() + " hinta: " + kasvisPizza.hinta() + "€");
		
		
		Pizza hawaiiPizza = new HawaiiPizza();
		hawaiiPizza = new Ananas(hawaiiPizza);
		hawaiiPizza = new Kinkku(hawaiiPizza);
		System.out.println(hawaiiPizza.kuvaile() + " hinta: " + hawaiiPizza.hinta() + "€");
		
		Pizza lihaPizza = new LihaPizza();
		lihaPizza = new Kinkku(lihaPizza);
		lihaPizza = new Salami(lihaPizza);
		lihaPizza = new Jauheliha(lihaPizza);
		System.out.println(lihaPizza.kuvaile() + " hinta: " + lihaPizza.hinta() + "€");

	}

}

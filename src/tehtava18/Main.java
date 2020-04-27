package tehtava18;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Kello kello = new Kello();
		kello.vuosi = 2020;
		kello.kuukausi = 9;
		kello.viisarit.sekunnit = 20;
		kello.viisarit.minuutit = 24;
		kello.viisarit.tunnit = 10;
		Kello uusiKello = (Kello)kello.clone();
		
		uusiKello.vuosi = 2019;
		uusiKello.viisarit.sekunnit = 40;
		
		System.out.println("Vuosi: "+ kello.vuosi +"\nKuukausi: " + kello.kuukausi
				+ "\nsekunnit: " + kello.viisarit.sekunnit
				+ "\nminuutit: " + kello.viisarit.minuutit
				+ "\ntunnit: " + kello.viisarit.tunnit);
		System.out.println();
		System.out.println("Vuosi: "+ uusiKello.vuosi +"\nKuukausi: " + uusiKello.kuukausi
				+ "\nsekunnit: " + uusiKello.viisarit.sekunnit
				+ "\nminuutit: " + uusiKello.viisarit.minuutit
				+ "\ntunnit: " + uusiKello.viisarit.tunnit);
		
		
	}

}

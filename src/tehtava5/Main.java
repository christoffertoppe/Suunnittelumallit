package tehtava5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veturi veturi = Veturi.getInstance();
		
		veturi.junanPituus();
		veturi.lisaaVaunu("matkustajia");
		veturi.lisaaVaunu("puuta");
		veturi.junanPituus();
		veturi.junanSisalto();
		
		System.out.print("\nuudelleen kutsuttuna getInstance() palauttaa saman veturin joka oli jo käytössä");
		Veturi veturi2 = Veturi.getInstance();
		System.out.println("");
		veturi2.junanSisalto();
		
		veturi.poistaVaunu(0);	
		veturi2.junanSisalto();
	}

}

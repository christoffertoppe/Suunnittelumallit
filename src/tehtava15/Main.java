package tehtava15;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Henkilo matti = new Henkilo();
		Henkilo jukka = new Henkilo();
		
		Adapter adapteri = new Adapter();
		
		matti.setNimi("Matti");
		jukka.setNimi("Jukka");
		
		matti.setIka("40");
		jukka.setIka("50");
		
		matti.setPituus("189");
		jukka.setPituus("170");
		
		matti.setPaino("100");
		jukka.setPaino("65");
		
		System.out.println(matti.toString());
		System.out.println(jukka.toString());
		System.out.println("String vertailu:");
		
		System.out.println(matti.getPaino().compareTo(jukka.getPaino()));

		int jukanPaino = adapteri.StringtoInt(jukka.getPaino());
		int matinPaino = adapteri.StringtoInt(matti.getPaino());
		
		int painoero = matinPaino - jukanPaino;
		System.out.println("Adapteria käyttäen int vertailu:");
		System.out.println(painoero);
	
		System.out.println(adapteri.StringtoInt(matti.getNimi()));
	}

}

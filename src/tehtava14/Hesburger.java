package tehtava14;

import java.util.ArrayList;
import java.util.List;

public class Hesburger implements RavintolaBuilder{

	private List<Object> hampurilainen = new ArrayList<>();
	
	@Override
	public void lisaaLeipa() {
		Leipa leipa = new Leipa();
		hampurilainen.add(leipa);
		
	}

	@Override
	public void lisaaSalaatti() {
		Salaatti salaatti = new Salaatti();
		hampurilainen.add(salaatti);
		
	}

	@Override
	public void lisaaPihvi() {
		Pihvi pihvi = new Pihvi();
		hampurilainen.add(pihvi);
		
	}

	@Override
	public void lisaaTomaatti() {
		Tomaatti tomaatti = new Tomaatti();
		hampurilainen.add(tomaatti);
		
	}

	@Override
	public void lisaaSuolakurkku() {
		Suolakurkku suolakurkku = new Suolakurkku();
		hampurilainen.add(suolakurkku);
	}

	@Override
	public void lisaaJuusto() {
		Juusto juusto = new Juusto();
		hampurilainen.add(juusto);
	}

	@Override
	public void lisaaMajoneesi() {
		Majoneesi majoneesi = new Majoneesi();
		hampurilainen.add(majoneesi);
	}

	@Override
	public void Ketsuppi() {
		Ketsuppi ketsuppi = new Ketsuppi();
		hampurilainen.add(ketsuppi);
	}
	
	public List getBurger() {
		return hampurilainen;
	}

}

package tehtava6c;

public class Oliivi extends TayteDecorator {

	Pizza pizza;
	private int hinta = 1;
	
	public Oliivi(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String kuvaile() {
		return pizza.kuvaile() + ", Oliivi ";
	}

	@Override
	public int hinta() {
		return hinta + pizza.hinta();
	}

}

package tehtava6c;

public class Kinkku extends TayteDecorator{

	Pizza pizza;
	private int hinta = 1;
	
	public Kinkku(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String kuvaile() {
		return pizza.kuvaile() + ", Kinkku ";
	}

	@Override
	public int hinta() {

		return hinta + pizza.hinta();
	}

}

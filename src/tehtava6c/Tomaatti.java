package tehtava6c;

public class Tomaatti extends TayteDecorator{

	Pizza pizza;
	private int hinta = 1;
	
	public Tomaatti(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String kuvaile() {
		return pizza.kuvaile() + ", Tomaatti ";
	}

	@Override
	public int hinta() {
		return hinta + pizza.hinta();
	}

}

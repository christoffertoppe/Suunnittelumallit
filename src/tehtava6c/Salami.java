package tehtava6c;

public class Salami extends TayteDecorator{

	Pizza pizza;
	private int hinta = 1;
	
	public Salami(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String kuvaile() {
		return pizza.kuvaile() + ", Salami ";
	}

	@Override
	public int hinta() {
		return hinta + pizza.hinta();
	}

}

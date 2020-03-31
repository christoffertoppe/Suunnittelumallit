package tehtava6c;

public class Jauheliha extends TayteDecorator {

	Pizza pizza;
	private int hinta = 1;

	public Jauheliha(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String kuvaile() {
		return pizza.kuvaile() + ", Jauheliha ";
	}

	@Override
	public int hinta() {
		return hinta + pizza.hinta();
	}

}

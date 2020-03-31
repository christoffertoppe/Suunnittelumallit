package tehtava6c;

public class Ananas extends TayteDecorator {

	Pizza pizza;
	private int hinta = 1;

	public Ananas(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String kuvaile() {
		return pizza.kuvaile() + ", Ananas ";
	}

	@Override
	public int hinta() {
		return hinta + pizza.hinta();
	}

}

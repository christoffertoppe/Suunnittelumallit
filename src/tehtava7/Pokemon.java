package tehtava7;

public abstract class Pokemon {
	Player player;
	String pokemonName;
	int hp;
	int exp;
	Pokemon(Player player) {
		this.player = player;
	}

	public abstract void evolve();

	public abstract void attack();

	public abstract void defend();

	public abstract void run();
	
	public abstract String getName();
	
	public abstract int getHp();
	
	public abstract int getExp();

	public void stats() {
		System.out.println(getName());
		System.out.println("Hp: " + getHp());
		System.out.println("Exp: " + getExp());
	}

}

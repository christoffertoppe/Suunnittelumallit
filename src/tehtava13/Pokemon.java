package tehtava13;

public abstract class Pokemon {
	Player player;
	String pokemonName;
	int hp;
	int exp;
	Bonus visitor;
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
	
	public abstract void accept(Bonus visitor);

	public abstract void attack(int giveBonus);		
	public abstract void defend(int giveBonus);
	public abstract void run(int giveBonus);


}

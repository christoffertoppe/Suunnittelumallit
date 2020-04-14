package tehtava13;

public class Charmeleon extends Pokemon {
	private int hp = 35;
	private int exp = 10;
	private String pokemonName = "[Charmeleon]";

	Charmeleon(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void evolve() {
		if (exp >= 50) {
			System.out.println("!!EVOLVED!!");
			player.changeState(new Charizard(player));
		}
	}

	@Override
	public void attack() {
		exp = exp + 4;
		System.out.println("Attacking gave you 4 Exp");
		accept(visitor);
		evolve();
	}

	@Override
	public void defend() {
		exp = exp + 2;
		System.out.println("Defending gave you 2 Exp");
		evolve();
	}

	@Override
	public void run() {
		System.out.println("Running away gave you 0 Exp");
		evolve();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pokemonName;
	}

	public int getHp() {
		return hp;
	}

	public int getExp() {
		return exp;
	}

	@Override
	public void attack(int giveBonus) {
		int bonus = 4 + giveBonus;
		exp = exp + 4 + giveBonus;
		System.out.println("Attacking gave you " + bonus + " total Exp");
		evolve();

	}

	@Override
	public void defend(int giveBonus) {
		int bonus = 2 + giveBonus;
		exp = exp + 2 + giveBonus;
		System.out.println("Defending gave you " + bonus + " total Exp");
		evolve();

	}

	@Override
	public void run(int giveBonus) {
		int bonus = giveBonus;
		exp = exp + giveBonus;
		System.out.println("Running away gave you " + bonus + " total Exp");
		evolve();

	}
	
	@Override
	public void accept(Bonus visitor) {
		// TODO Auto-generated method stub
		visitor.giveBonus(this);
	}

}

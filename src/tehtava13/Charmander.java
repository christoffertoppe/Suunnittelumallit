package tehtava13;

public class Charmander extends Pokemon {
	private int hp = 5;
	private int exp = 0;
	private String pokemonName = "[Charmander]";
	private Visitor bonus = new Bonus();
	
	Charmander(Player player) {
		super(player);
	}

	@Override
	public void evolve() {
		if (exp >= 10) {
			System.out.println("!!EVOLVED!!");
			player.changeState(new Charmeleon(player));
		}
	}

	@Override
	public void attack() {
		exp = exp + 2;
		System.out.println("Attacking gave you 2 Exp");
		exp = exp + accept(bonus);
		evolve();
	}

	@Override
	public void defend() {
		exp++;
		System.out.println("Defending gave you 1 Exp");
		exp = exp + accept(bonus);
		evolve();
	}

	@Override
	public void run() {
		System.out.println("Running away gave you 0 Exp");
		exp = exp + accept(bonus);
		evolve();
	}

	public String getName() {
		return pokemonName;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getExp() {
		return exp;
	}

	@Override
	public int accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}

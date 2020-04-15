package tehtava13;

public class Charmeleon extends Pokemon {
	private int hp = 35;
	private int exp = 10;
	private String pokemonName = "[Charmeleon]";
	private Visitor bonus = new Bonus();

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
		exp = exp + accept(bonus);
		evolve();
	}

	@Override
	public void defend() {
		exp = exp + 2;
		System.out.println("Defending gave you 2 Exp");
		exp = exp + accept(bonus);
		evolve();
	}

	@Override
	public void run() {
		System.out.println("Running away gave you 0 Exp");
		exp = exp + accept(bonus);
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
	public int accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}

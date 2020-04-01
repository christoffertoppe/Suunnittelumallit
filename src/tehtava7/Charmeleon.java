package tehtava7;

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

}

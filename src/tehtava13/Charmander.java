package tehtava13;

public class Charmander extends Pokemon {
	private int hp = 5;
	private int exp = 0;
	private String pokemonName = "[Charmander]";

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
		evolve();
	}

	@Override
	public void defend() {
		exp++;
		System.out.println("Defending gave you 1 Exp");
		evolve();
	}

	@Override
	public void run() {
		System.out.println("Running away gave you 0 Exp");
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
	public void attack(int giveBonus) {
		int bonus = 2 + giveBonus;
		exp = exp +2 + giveBonus;
		System.out.println("Attacking gave you "+ bonus +" total Exp");
		evolve();
		
	}

	@Override
	public void defend(int giveBonus) {
		int bonus = 1 + giveBonus;
		exp = exp +1 + giveBonus;
		System.out.println("Defending gave you "+ bonus +" total Exp");
		evolve();
		
	}

	@Override
	public void run(int giveBonus) {
		int bonus = giveBonus;
		exp = exp + giveBonus;
		System.out.println("Running away gave you "+ bonus +" total Exp");
		evolve();
		
	}

	@Override
	public void accept(Bonus visitor) {
		// TODO Auto-generated method stub
		
	}
	
}

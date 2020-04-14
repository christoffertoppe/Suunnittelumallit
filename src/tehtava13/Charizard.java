package tehtava13;

public class Charizard extends Pokemon {
	private int hp = 120;
	private int exp = 50;
	private String pokemonName = "[Charizard]";
	
	Charizard(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void evolve() {
		System.out.println("Final stage");
	}

	@Override
	public void attack() {
		exp = exp +8;
		System.out.println("Attacking gave you 8 Exp");
		
	}

	@Override
	public void defend() {
		exp = exp +5;
		System.out.println("Defending gave you 5 Exp");
		
	}

	@Override
	public void run() {
		System.out.println("Running away gave you 0 Exp");
		
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
		int bonus = 8 + giveBonus;
		exp = exp + 8 + giveBonus;
		System.out.println("Attacking gave you "+ bonus +" total Exp");
		
	}

	@Override
	public void defend(int giveBonus) {
		int bonus = 5 + giveBonus;
		exp = exp + 5 + giveBonus;
		System.out.println("Defending gave you "+ bonus +" total Exp");
		
	}

	@Override
	public void run(int giveBonus) {
		int bonus = giveBonus;
		exp = exp + giveBonus;
		System.out.println("Running away gave you "+ bonus +" total Exp");
		
	}

	@Override
	public void accept(Bonus visitor) {
		// TODO Auto-generated method stub
		
	}



}

package tehtava13;

public class Charizard extends Pokemon {
	private int hp = 120;
	private int exp = 50;
	private String pokemonName = "[Charizard]";
	private Visitor bonus = new Bonus();	
	
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
		exp = exp + accept(bonus);
	}

	@Override
	public void defend() {
		exp = exp +5;
		System.out.println("Defending gave you 5 Exp");
		exp = exp + accept(bonus);
	}

	@Override
	public void run() {
		System.out.println("Running away gave you 0 Exp");
		exp = exp + accept(bonus);
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

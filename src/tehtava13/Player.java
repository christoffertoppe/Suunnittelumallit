package tehtava13;

public class Player {
	private Pokemon pokemon;

	public Player() {
		this.pokemon = new Charmander(this);
	}
	
	public void changeState(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}
}

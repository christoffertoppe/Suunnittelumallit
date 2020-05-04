package tehtava22;

public class Test {
	
	public static void main(String[] args) {
		SilverScreen lamp = new SilverScreen();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);
		WallButton button1 = new WallButton(switchDown);
		WallButton button2 = new WallButton(switchUp);
		
		button1.push();
		button2.push();
		
	}
}

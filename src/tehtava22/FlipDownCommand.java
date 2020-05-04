package tehtava22;

public class FlipDownCommand implements Command {
	private SilverScreen screen;
	
	public FlipDownCommand(SilverScreen screen) {
		this.screen = screen;
	}	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.turnDown();
	}
	
}

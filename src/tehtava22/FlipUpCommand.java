package tehtava22;

public class FlipUpCommand implements Command {
	private SilverScreen screen;

	public FlipUpCommand(SilverScreen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.turnUp();
	}
	
}

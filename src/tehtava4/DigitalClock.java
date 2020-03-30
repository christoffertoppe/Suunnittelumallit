package tehtava4;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

	private ClockTimer timer;
	
	public DigitalClock() {
		
	}


	public void update(Observable o, Object arg) {
		System.out.println("time is: " + arg);
	}

	
}

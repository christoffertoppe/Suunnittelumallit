package tehtava4;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class Subject implements Observer {
	Set<Observer> observers = new HashSet(); 
	
	public void attach(DigitalClock digitalClock) {
		observers.add((Observer) digitalClock);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}

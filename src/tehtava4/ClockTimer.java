package tehtava4;

import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
	private int hours;
	private int minutes;
	private int seconds;
	
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	
	public String getTime() {
		return hours + ":" + minutes + ":" + seconds;
	}
	private void tick() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error Occured.");
		}
	}
	@Override
	public void run() {
		while(true) {
			 tick();
			 System.out.println("1");
			setChanged();
			String arg = getTime();
			notifyObservers(arg);
		}
		
	}	
}

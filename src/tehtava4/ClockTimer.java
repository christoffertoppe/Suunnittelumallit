package tehtava4;

import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
	private int hours;
	private int minutes;
	private int seconds;

	public String getTime() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;

	}

	private void tick() {
		int milliseconds = 1000;
		try {
			if (seconds < 59) {
				seconds++;
			} else {
				seconds = 0;
				if (minutes < 59) {
					minutes++;
				} else {
					minutes = 0;
					if (hours < 23) {
						hours++;
					} else {
						hours = 0;
					}
				}
			}
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.out.println("Error Occured.");
		}
	}

	@Override
	public void run() {
		while (true) {
			tick();
			setChanged();
			String arg = getTime();
			notifyObservers(arg);
		}

	}
}

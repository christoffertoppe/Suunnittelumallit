package tehtava4;

class Main {

	public static void main(String[] args) {
			ClockTimer timer = new ClockTimer();
			DigitalClock digitalClock = new DigitalClock();
			timer.addObserver(digitalClock);
			new Thread(timer).run();
	}
}

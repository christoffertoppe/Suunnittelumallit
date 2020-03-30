package tehtava4;

class Main {

	public static void main(String[] args) {
			ClockTimer timer = new ClockTimer();
			DigitalClock digitalClock = new DigitalClock();
			DigitalClock digitalClock2 = new DigitalClock();
			timer.addObserver(digitalClock);
			timer.addObserver(digitalClock2);
			new Thread(timer).run();
	}
}

package tehtava11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pelaajaMaara = 5;

		Scanner scanner = new Scanner(System.in);

		List<Arvuuttaja.Memento> savedTimes = new ArrayList<Arvuuttaja.Memento>();

		Arvuuttaja arvuuttaja = new Arvuuttaja();

		Arvuuttaja.Memento arvaus = arvuuttaja.liityPeliin();

		for(int i = 0; i <pelaajaMaara ; i++) {
			Thread object = new Thread(new Pelaaja());
			object.start();
		}
	}

}
 
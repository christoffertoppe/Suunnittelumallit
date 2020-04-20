package tehtava14;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		McDonalds mcdonalds = new McDonalds();
		Hesburger hesburger = new Hesburger();
		
		mcdonalds.lisaaLeipa();
		hesburger.lisaaLeipa();
		
		mcdonalds.lisaaPihvi();
		hesburger.lisaaPihvi();
		
		mcdonalds.lisaaJuusto();
		hesburger.lisaaJuusto();
		
		mcdonalds.lisaaTomaatti();
		hesburger.lisaaTomaatti();
		
		mcdonalds.lisaaMajoneesi();
		hesburger.lisaaMajoneesi();
		
		
		List burger = hesburger.getBurger();
		
		for(Object ainesosa: burger) {
			System.out.println(ainesosa.toString());
		}			
		System.out.println();
		
		
		
		
		System.out.println(mcdonalds.getBurger());
		
	}

}

package tehtava9;

public class Main {

	public static void main(String[] args) {
		LineBreakEveryElement everyline = new LineBreakEveryElement();
		LineBreakEverySecondElement secondline = new LineBreakEverySecondElement();
		LineBreakEveryThirdElement thirdline = new LineBreakEveryThirdElement();

		
		String oneWordPerLine = everyline.listToString(everyline.createList());
		System.out.println(oneWordPerLine);
		System.out.println();
		String twoWordsPerLine = secondline.listToString(secondline.createList());
		System.out.println(twoWordsPerLine);
		String threeWordsPerLine = thirdline.listToString(thirdline.createList());
		System.out.println();
		System.out.println(threeWordsPerLine);
	}

}

package tehtava9;

import java.util.List;

public class LineBreakEverySecondElement extends ListCreator implements ListConverter{

	@Override
	public String listToString(List list) {
		// TODO Auto-generated method stub
		String stringWithLines = "";
		int wordCount = 0;
		
		// lista lis‰t‰‰n taulukkoon
		String[] taulukko = new  String[list.size()];
		
		for(int i = 0; i < taulukko.length; i++) {
			taulukko[i] = (String) list.get(i);
		}
		
		// taulukon arvoista luodaan String 
		// jossa joka toisen sanan j‰lkeen rivin vaihto
		for(String line : taulukko) {
			if(wordCount == 1) {
			stringWithLines = stringWithLines + line +"\n";
			wordCount = 0;
			} else {
				stringWithLines = stringWithLines + line + " ";
				wordCount++;
			}
		}

		return stringWithLines;
	}

}

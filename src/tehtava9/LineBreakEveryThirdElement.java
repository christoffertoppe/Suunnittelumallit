package tehtava9;

import java.util.Iterator;
import java.util.List;

public class LineBreakEveryThirdElement extends ListCreator implements ListConverter{

	@Override
	public String listToString(List list) {
		String stringWithLines = "";
		Iterator iterator = list.iterator();
		int wordCount = 0;
		while(iterator.hasNext()) {
			if(wordCount == 2) {
				stringWithLines = stringWithLines + iterator.next() + "\n";
				wordCount = 0;
			} else {
				stringWithLines = stringWithLines + iterator.next() + " ";
				wordCount++;
			}
		}
		return stringWithLines;
	}

}

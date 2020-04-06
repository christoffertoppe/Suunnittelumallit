package tehtava9;

import java.util.List;

public class LineBreakEveryElement extends ListCreator implements ListConverter{

	// listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia.
	@Override
	public String listToString(List list) {
		String stringWithLines = "";
		for(int i = 0; i < list.size(); i++) {
			Object lineToBeAdded = list.get(i);
			stringWithLines = stringWithLines + (String) lineToBeAdded + "\n";			
		}	
		return stringWithLines;
	}

}

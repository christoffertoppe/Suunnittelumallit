package tehtava9;

import java.util.ArrayList;
import java.util.List;

abstract class ListCreator {

	int words = 300;
	
	public List createList() {
		List<String> list = new ArrayList<String>();
		// words muuttuja määrittää kuinka monta sanaa on listassa
		
		for (int i = 0; i < words; i++) {
			list.add("Word" + (i + 1));
		}

		return list;
	}
}

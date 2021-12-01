import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This sorting method provides logic to sort name based on list
 * @author rex
 */
public class NameSorted implements Delimiter{
	@Override
	public void sorting(List<String> nameList) {
		try {
			for (int i = 0; i < nameList.size(); i++) {
				for(int j = i + 1; j < nameList.size(); j++) {
					StringBuffer firstWord = new StringBuffer(nameList.get(i));
					StringBuffer comparedWord = new StringBuffer(nameList.get(j));
					
					if(firstWord.substring(firstWord.lastIndexOf(DELIMITER))
							.compareTo(comparedWord.substring(comparedWord.lastIndexOf(DELIMITER))) > 0) {
						Collections.swap(nameList, i , j);
					}
				}
			}
			PrintInfo.printSortedName(nameList);
			WriteFile.writeSortedName(nameList);
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
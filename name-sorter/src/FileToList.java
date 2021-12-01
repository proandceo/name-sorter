import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Read file and then put the file's info into list
 * @author rex
 *
 */
public class FileToList {
	public static void swapFileToList(String args) {
		try {
			File file = new File(args);
	     	Scanner scanner = new Scanner(file);
	     	List<String> nameList = new ArrayList<String>();
	     	
	     	while (scanner.hasNextLine()) {
	     		StringBuffer data = new StringBuffer(scanner.nextLine());
	     		nameList.add(data.toString());
	     	}
	     	NameSorted ns = new NameSorted();
	     	ns.sorting(nameList);
	     	
	     	scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

import java.io.FileWriter;
import java.util.List;

/**
 * Print ordered name into Console.
 * @author rex
 *
 */
public class PrintInfo {
	public static void printSortedName(List<String> nameList) {
		for(int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
	}
}

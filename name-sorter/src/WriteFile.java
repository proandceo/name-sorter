import java.io.FileWriter;
import java.util.List;

/**
 * Write ordered name to a file
 * @author rex
 *
 */
public class WriteFile {
	public static void writeSortedName(List<String> nameList) {
		try{    
			FileWriter fw=new FileWriter("./sorted-names-list.txt");    
			for(int i = 0; i < nameList.size(); i++) {
				fw.write(nameList.get(i) + "\n");
			}
			fw.close();    
		}catch(Exception e){
			e.printStackTrace();;
		}    
	}

}

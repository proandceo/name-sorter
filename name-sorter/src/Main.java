/**
 * execute disorder name to order name
 * @author rex
 *
 */
public class Main {
	public static void main(String[] args) {
		if(args.length != 1 ) {
			System.out.println("There is not a file name");
			System.exit(0);
		}else {
			FileToList.swapFileToList(args[0]);
		}
	}
}

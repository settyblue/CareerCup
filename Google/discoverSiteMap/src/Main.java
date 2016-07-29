import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
/**
 * https://www.careercup.com/question?id=5701929771466752
 * please implement 
 * discover_site_map(log) 
 * 
 * discover_site_map returns a representation of the links between pages, 
 * using whatever data structure you think is suitable.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		File file = new File("Log.txt");
		HashMap<String,String> currentPageTracker = new HashMap<String,String>();
		HashMap<String,HashSet<String>> links = new HashMap<>();
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				String line = input.nextLine(); 
				String[] tokens = line.split(" ");
				//System.out.println(tokens[2]+" "+tokens[4]);
				if(!currentPageTracker.containsKey(tokens[2])){
					currentPageTracker.put(tokens[2], tokens[4]);
				}else{
					String prevPage = currentPageTracker.get(tokens[2]);
					if(links.containsKey(prevPage)){
						links.get(prevPage).add(tokens[4]);
					}else{
						HashSet<String> set = new HashSet<String>();
						set.add(tokens[4]);
						links.put(prevPage, set);
					}
					currentPageTracker.put(tokens[2], tokens[4]);
				}
			}
			System.out.println(links);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

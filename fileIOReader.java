/**JavaAssignmentsfileIOreader.java
 * author jkirkish
 *Jan 25, 2020
 */
package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jkirkish
 *
 */
public class fileIOReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line = "";
			while((line = fileReader.readLine()) != null) {
				
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Unable to find file");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

/**JavaAssignmentsJavaCollectionsApp.java
 * author jkirkish
 *Mar 7, 2020
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jkirkish
 *
 */
public class JavaCollectionsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String [] months = new String[4];
		
		months[0] = "January";
		months[1] = "January";
		months[2] = "January";	
		months[3] = "January";
		//ordinary arrays are not as flexible 
		for(String month : months) {
			System.out.println(month);
		}
		
		/*Collections are a Java solution to have more flexibility in a more
		*useful data structure
		*List (a type of collection)
		*Set  (a type of collection)
		*Map  (a type of collection)
		*/
		
		/*Lists can keep adding elements to the list. It is not fixed like a declared Array is. 
		*An ArrayList is a list backed by an array
		*Default capacity of backup array is size of 10. It makes a copy and increase by a certain factor
		*to increase something larger than 10. It also works to shrink the size. 
		*CRUD create read update delete
		*/
		System.out.println("\n\nList Example of Students\n\n");
		List<String>students = new ArrayList<String>();
		students.add("Johnny Hems");//Index 0
		students.add("Jessica Hems");//Index 1
		students.add("Michelle Gerber");//Index 2
		students.add("Michael Strout ");//Index 3
		students.add("Chris Alan");//Index 4
		
		displayArrayList(students);
		
		
		//you can remove an element from an index in the arrayList. Indexes are zero based. 
		//Java checks to see if first element to the last element equals the value you requested. 
		//If a match is found it is selected to be removed
		//the matching element is removed and shifts the remaining elements so that emply index is 
		//occupied
		System.out.println("Remove element 1 from list: " + students.get(1));
		students.remove(1);//remove Jessica Hems from the list. 
		displayArrayList(students);
	}

	/**
	 * @param students
	 */
	public static void displayArrayList(List<String> students) {
		for(String student: students) {
			System.out.println(student);
		}
	}

}

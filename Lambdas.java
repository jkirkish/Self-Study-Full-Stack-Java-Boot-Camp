/**JavaAssignmentsLambdas.java
 * author jkirkish
 *Mar 25, 2020
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author jkirkish
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		List<String> victims = new ArrayList<String>();
		victims.add("Mike");
		victims.add("John");
		victims.add("Sarah");
		victims.add("Shelby");
		victims.add("Melissa");
		
		//sort method for a collections arraylist 
		Collections.sort(victims, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//o2 compare to o1 make descending order of list
				return o2.compareTo(o1);
			}
			
		});
		
		//example 1 of a lambda expression
		Collections.sort(victims, (o1, o2) -> o2.compareTo(o1));
		
		//example 2 lambda
		Collections.sort(victims, (String o1, String o2) -> o2.compareTo(o1));
		
		//example 3 lambda
		Collections.sort(victims, (o1, o2) -> {
				if(o2 != null && o1 != null)
				{
				return o2.compareTo(o1);
				}
				else {
					return 0;
				}
		}
	);
		
		showList(victims); 
		
	}
	private static void showList(List<String>values) 
	{
		for(String value : values)
		{
			System.out.println(value);
		}
		System.out.println("");
	}

}

/**JavaAssignmentsStreamApp.java
 * author jkirkish
 *Mar 25, 2020
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jkirkish
 *
 */
public class StreamApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> months = new ArrayList<>();
		
		addNames(months);
		
		
		/*for (String month : months) {
			System.out.println(month);
		}
		You can combine a stream with a lambda to do the same thing a for each loop does with a list
		*/
		//this is a stream. YOu can stack dots verticallyfor readability
		//You can lambda or consumer interfaces
		//where there is only one parameter you don't need the parentheses
		//You also can omit the datatype and just have the variable name whatever you want to call it.
		//when there one line of code in the body. You can omit the { } brackets. 
		//And you can omit the extra semi colon
		months.stream()//method signature dataType -> System.out.println(dataType));
		      .forEach( dataType -> System.out.println(dataType));
		
		System.out.println();
		//object.parallelStream() is a way to multistream
		//the list is outputted asychronously and it is not one after the other in the list
		months.parallelStream()//method signature dataType -> System.out.println(dataType));
	      .forEach( dataType -> System.out.println(dataType));
	}
	
	public static void addNames(List<String> names) 
	{
		names.add("Jan");
		names.add("Feb");
		names.add("Mar");
		names.add("Apr");
		names.add("May");
		names.add("June");
		names.add("July");
		names.add("Aug");
		names.add("Sept");
		names.add("Oct");
		names.add("Nov");
		names.add("Dec");
	}

}

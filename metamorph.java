/**
 * 
 */
package testingBankAcconts;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jkirkish
 *
 */
public class metamorph {
	
	
	
	public static<T1, T2> String join (T1 v1, T2 v2)
	{
		return v1.toString() + "-> " + v2.toString();
	}
  // you can ? in a generic and then extend a child class
	public static String join (List<? extends Number> list)
	{
		
		return list.stream().map(Number::toString).collect(Collectors.joining(","));
		
	}
}

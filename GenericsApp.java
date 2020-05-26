/**
 * 
 */
package testingBankAcconts;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author jkirkish
 *
 */
public class GenericsApp {
	
	@Test
    public void what_a_Generic_is() {
		//helps catch bugs sooner at compile time, not run time.
		List<String> list = new ArrayList<>();
		//Generic type for lists is String
		list.add("My String to you");
		list.add("Help Me");
		list.add("E");
		
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
    		
	}
	@Test
	public void another_Generic() 
	{
		HisPair<Integer, String> pair = new HisPair<>(1,"one");
		pair.getKey();
		pair.getValue();
	}
	@Test
	public void specifying_wildcard_generic_types_at_method_level() {
		
		List<Short> list = new ArrayList<>();
		list.add((short) 1); list.add((short) 3); list.add((short) 1056);
		String val = metamorph.join(list);
		System.out.println(val);
		
	}
	
}

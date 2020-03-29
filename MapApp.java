/**JavaAssignmentsMapApp.java
 * author jkirkish
 *Mar 15, 2020
 */
package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jkirkish
 *
 */
public class MapApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Map is data structure in collections
		 * Map store two types of data inside
		 * other languages call this dictionary
		 * Maps sets and lists are interfaces
		 * You have to import Map and HashMap from java.util library
		 * HashMaps document data using key value pairs.  Key,Value
		 * May<key>,<value>MapName = new HashMap<>()
		 * purpose of a key is to uniquely identify something similary to primary keys in databases
		 * Store and retrieve data in an efficient manner CRUD.
		 * The key is one object. The value can be flexible with any object 
		 */
		Map<Integer,String>employees = new HashMap<>();
		
		//similar to arraylist.add to put something in an array or list. 
		//Hashmaps use the hashmap.put(key, value) method to add to it. 
		//the key has to be unique to create data
		employees.put(1, "Michelle");
		employees.put(2, "Chris");
		employees.put(3, "Jeff");
		employees.put(4, "Joe");
		employees.put(4, "Joey");
		//how to get data using hashmap.get(key);
		System.out.println("Try to get data using a valid key");
		System.out.println(employees.get(2));
		
		//If you use the same key twice in two different put methods, that key will be
		//updated with the last put method used for it. 
		
		System.out.println("Try to get data using a valid key twice");
		System.out.println(employees.get(4));
		
		
		// you can use the map.remove(key) to remove a value from a hashmap
		//the key is there,but the value is null
		employees.remove(1);
		
		System.out.println("A hashmap with the key 1 value removed");
		System.out.println(employees.get(1));
		
	}

}

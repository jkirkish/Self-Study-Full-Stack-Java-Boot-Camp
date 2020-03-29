/**JavaAssignmentsStreamApp2.java
 * author jkirkish
 *Mar 26, 2020
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jkirkish
 *
 */
public class StreamApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//list of cities
		List<Cities> cities = new ArrayList<>();
		
		cities.add(new Cities("Columbus","OH",900000));
		cities.add(new Cities("New York City","NYC",8000000));
		cities.add(new Cities("Los Angeles","CA",4000000));
		cities.add(new Cities("Honolulu","HI",811000));
		cities.add(new Cities("Seattle","WA",775000));
		cities.add(new Cities("Miami","FL",657000));
		cities.add(new Cities("Casper","WY",235000));
		
		List<String> cityNames = cities.stream()
											.map(aCity ->aCity.getCityName())
											.collect(Collectors.toList());
		
		 String states = cities.stream()
			                                .map(aCity -> aCity.getState())
			                                .distinct()
			                                .filter(aState -> aState.startsWith("W"))
			                                .collect(Collectors.joining(", "));
		
		cityNames.stream()
		         .forEach(city -> System.out.println(city));
		System.out.println("------------");
		
		 System.out.println(states);
		
	}
	
}

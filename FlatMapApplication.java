/**JavaAssignmentsFlatMapApplication.java
 * author jkirkish
 *Mar 28, 2020
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.LinkedHashSet;

/**
 * @author jkirkish
 *
 */
public class FlatMapApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<List<Integer>> listOfValuesList = new ArrayList<>();
		listOfValuesList.add(Arrays.asList(1,2,3));
		listOfValuesList.add(Arrays.asList(4,5,6));
		listOfValuesList.add(Arrays.asList(9,2,7));
		listOfValuesList.add(Arrays.asList(10,12,13));
		listOfValuesList.add(Arrays.asList(35,24,233));
		listOfValuesList.add(Arrays.asList(36,37,38));
		
        long sum = listOfValuesList.stream()
						           .flatMap(x -> x.stream())
						           .mapToInt(x ->x.intValue())
						           .sum();
						                    
						
		System.out.println(sum);
		
		
	}

}

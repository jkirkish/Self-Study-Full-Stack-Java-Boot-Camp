package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {  
		Set<TaxPayer>taxPayer = new HashSet<>();
		
		taxPayer.add(new TaxPayer(123452345,"Donald",39));
		taxPayer.add(new TaxPayer(123452349,"Donald",39));
		taxPayer.add(new TaxPayer(123452348,"Donald",39));
		
		for(TaxPayer taxPayers : taxPayer)
		{
			System.out.println(taxPayers);
		}
		//firstExample();
		
		
	}
	/**
	 * 
	 */
	public static void firstExample() {
		Set<Integer> diffValues = new LinkedHashSet<>();
		/*
		 * Does not contain sets
		 * Linked HashSet maintains things in order
		 */
		System.out.println(diffValues.add(13));
		System.out.println(diffValues.add(14));
		System.out.println(diffValues.add(15));
		System.out.println(diffValues.add(16));
		System.out.println(diffValues.add(17));
		System.out.println(diffValues.add(18));
		
		DisplaySet(diffValues);
		
		Set<String> diffValues1 = new HashSet<>();
		diffValues1.add("Mike");
		diffValues1.add("Teal");
		diffValues1.add("Albert");
		diffValues1.add("Niece");
		
		for(String children : diffValues1)
		{
			//hashsets do not maintain order
			System.out.println(children);
		}
	}
	private static void DisplaySet(Set<Integer>values) {
		for(Integer value : values) {
			System.out.println(value);
		}
	}
}


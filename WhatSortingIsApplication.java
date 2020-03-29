/**JavaAssignmentswhatSortingIsApplication.java
 * author jkirkish
 *Feb 28, 2020
 */
package howToSort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jkirkish
 *
 */
public class WhatSortingIsApplication {
   //generics 
	public static void main(String[] args) {
		
		String [] siblings = new String[10];
		
		siblings[0] = "Jill";
		siblings[1] = "Kaila";
		siblings[2] = "Mike";
		siblings[3] = "Mindy";
		siblings[4] = "Stephanie";
		siblings[5] = "Justin";
		siblings[6] = "Margot";
		siblings[7] = "Kim";
		siblings[8] = "Sara";
		siblings[9] = "Sam";
		
		for (String member : siblings)
		{
			System.out.print(member + " ");
		}
		System.out.println("\n----------------------------");
		Arrays.sort(siblings);
		System.out.println("After it is sorted");
		System.out.println("\n----------------------------");
		for (String member : siblings)
		{
			System.out.print(member + " ");
		}
		
		Dogs[] pets = new Dogs[5];
		
		pets[0] = new Dogs("Bill",100);
		pets[1] = new Dogs("Sam",25);
		pets[2] = new Dogs("Tacos",5);
		pets[3] = new Dogs("Nacho",15);
		pets[4] = new Dogs("Lucy",200);
		System.out.println("\n----------------------------");
		for(Dogs pet : pets)
		{
			System.out.print(pet.getNames() + " " + pet.getWeight() + ", ");
		}
		Arrays.sort(pets);
		System.out.println("\n----------------------------");
		System.out.println("After it is sorted by weight lightest to heaviest\n");
		for(Dogs pet : pets)
		{
			System.out.print(pet.getNames() + " " + pet.getWeight() + ", ");
		}
		System.out.println("\n----------------------------");
		//Comparator interface has an compare method that takes two objects
		Arrays.sort(pets, new Comparator<Dogs>(){

			@Override
			public int compare(Dogs pet1, Dogs pet2) {
				
				return pet1.getWeight().compareTo(pet2.getWeight());
			}
			
		});
			for(Dogs dog : pets) {
				System.out.println(dog.getNames() + " is " + dog.getWeight() + " pounds heavy.");
			}
		
		}
}

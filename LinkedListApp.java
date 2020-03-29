/**JavaAssignmentsLinkedListApp.java
 * author jkirkish
 *Mar 10, 2020
 */
package collections;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jkirkish
 *
 */
public class LinkedListApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> money = new LinkedList<>();
		
		money.add(200);
		money.add(14);
		money.add(234);
		money.add(500);
		money.add(432);
		money.add(258);
		
		/*Linkedlist are easy to remove from
		 * LInkedlist uses nodes. Which are objects that have 3 main properties 
		 * next-
		 * previous
		 * boolen for head
		 * boolen for tail
		 * 
		 * Head=1    Head=0    Head=0    Head=0     Head=0    Head=0
		 * Tail=0<-> Tail=0<-> Tail=0<-> Tail=0<->  Tail=0<->  Tail=1
		 *  (200)     (14)     (234)      (500)     (432)      (258)
		 *  
		 *  
		 *  traversing through a list and removing or adding elements a 
		 *  linkList is great to use.LInkList have a bigger memory footprint.
		 */
		displayLInkedList(money);
        System.out.println();
        //remove a value indicated by index.
		money.remove(0);
	    displayLInkedList(money);
	    
	    //remove a value that can be casted. 
	    money.remove((Integer)432);
        System.out.println();
        displayLInkedList(money);
	}
       
	
	/**
	 * @param money
	 */
	public static void displayLInkedList(List<Integer> money) {
		for(Integer values : money) 
		{
			System.out.printf("$%d\n", values);
		}
	}

}

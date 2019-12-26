import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Author Joseph Kirkish
 * 
 * Date 12/19/2019 
**/

public class higherLowerGuessGame{
	
	
	
	public static void main(String[]args) {
		
		//variable
		int guessNumber;
		int count = 0;
		//Objects
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		//guess a number that’s randomly chosen between 1 and 100.
		System.out.print("Pick a number between 1 and 100:");
		guessNumber = input.nextInt();
		int actualNumber = random.nextInt(100)+1;
		
		//The player only gets 5 chances to guess the number.
		while(count < 4) {
			System.out.println();
		//three outcomes, it lower, higher or guessed right
		if(guessNumber < actualNumber)
		{
			System.out.println("Please pick a higher number\n");
			System.out.print("Pick a number between 1 and 100:");
			guessNumber = input.nextInt();
		}else if(guessNumber > actualNumber)
		{
			System.out.println("Please pick a lower number\n");
			System.out.print("Pick a number between 1 and 100:");
			guessNumber = input.nextInt();
		}
		else {
			 System.out.println("You win!\n");
		}
		count++;
		if(count == 4)
		{
			System.out.println("\nYou lose!");
			System.out.println("\nThe number to guess was: " + actualNumber);
		}
		}
		
	}

}


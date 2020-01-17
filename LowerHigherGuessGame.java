import java.util.Random;
import java.util.Scanner;

/**JavaAssignmentsLowerHigherGuessGame.java
 * author jkirkish
 *Jan 17, 2020
 */

/**
 * @author jkirkish
 *
 */
public class LowerHigherGuessGame {


	public static void forLooper() {
		int guessNumber;
		// Objects
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		// guess a number that’s randomly chosen between 1 and 100.
		System.out.print("Pick a number between 1 and 100:");
		guessNumber = input.nextInt();
		int actualNumber = random.nextInt(100) + 1;

		// The player only gets 5 chances to guess the number.
		for (int count = 0; count <= 3; count++) {
			System.out.println();
			// An error message is displayed if the user input a number outside of range
			// 1-100
			if (guessNumber <= 0 || guessNumber >= 101) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				System.out.print("Pick a number between 1 and 100:");
				guessNumber = input.nextInt();
			} else {
				// three outcomes, it lower, higher or guessed right
				if (guessNumber < actualNumber) {
					System.out.println("Please pick a higher number\n");
					System.out.print("Pick a number between 1 and 100:");
					guessNumber = input.nextInt();
				} else if (guessNumber > actualNumber) {
					System.out.println("Please pick a lower number\n");
					System.out.print("Pick a number between 1 and 100:");
					guessNumber = input.nextInt();
				} else {
					System.out.println("You win!\n");
				}
			}
			if (count == 3 && guessNumber == actualNumber) {
				System.out.println("\nYou win!");
				System.out.println("\nThe number to guess was: " + actualNumber);
			} else if (count == 3 && guessNumber != actualNumber) {
				System.out.println("\nYou lose!");
				System.out.println("\nThe number to guess was: " + actualNumber);
			}
		}
		// close the scanner to prevent memory leaks
		input.close();
	}

	
	
	public static void main(String[] args) {
		
		forLooper();
	}

}

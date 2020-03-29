/**JavaAssignmentsuserLogin.java
 * author jkirkish
 *Jan 25, 2020
 */
package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author jkirkish
 *
 */
public class userLogin {

	static User[] user = new User[4];
	static UserService userService = new UserService();

	public static void putFileIntoArray() throws IOException {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line = "";
			int ArrayElement = 0;
			while ((line = fileReader.readLine()) != null) {
				user[ArrayElement] = new User(line.split(","));
				System.out.println(user[ArrayElement]);
				ArrayElement = ArrayElement + 1;
			}

		} catch (FileNotFoundException e) {
			System.err.println("Unable to find file");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException {

		userLogin.putFileIntoArray();

		// Scanner Object
		Scanner input = new Scanner(System.in);

		// boolean validLogin = false;
		 int attemptsRemain = 6;

		for (int loginAttempts = 0; loginAttempts < 6; loginAttempts++) {
			// while(!validLogin && loginAttempts < 5) {

			// prompt the user for their email username
			System.out.print("Enter your username: ");
			String username = input.nextLine();

			// prompt the user for their email username
			System.out.print("Enter your password: ");
			String password = input.nextLine();

			User confirmedUser = userService.isValidUser(username, password);
			if (confirmedUser != null) {
				System.out.println("Welcome: " + confirmedUser.getName());
				// validLogin = true;
				break;
			} else {
				if(loginAttempts < 5) {
				System.out.println("Invalid login, please try again");
				}
				attemptsRemain--;
				System.out.println(attemptsRemain + " Login attempts remaining");
				// loginAttempts++;
				if (loginAttempts >= 5) {
					System.out.println("Too many failed login attempts, you are now locked out.");
				}
			}
		}
	}

}

/**JavaAssignmentsRegExApp.java
 * author jkirkish
 *Mar 2, 2020
 */
package regex;

/**
 * @author jkirkish
 *Regex is used to validate inputs. Validate the structure of an email address,
 *password, or other input. Use lots of test cases for validating input
 * https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 * website above helps to explain regex
 * https://www.regextester.com/
 */
public class RegExApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*valid email address kirkish.2@gmail.com
		 * invalid email address: kirkish.com
		 * invalid email address: mybusinessname.thisisnotrealdomain.
		 * valid email address: josephkirkish@hotmail.com
		 * valid email address: jkirkish@businessname.com
		 * valid email address: marketing@facebook.com
		 */
		
		regexMatches("false.email@hotmail.com");
		regexMatches("kirkish.com");
		regexMatches("mybusinessname.thisisnotrealdomain");
		regexMatches("josephkirkish@hotmail.com");
		regexMatches("jkirkish@businessname.com");
		regexMatches("marketing@facebook.com");
	}

	/**
	 * @param email
	 */
	public static void regexMatches(String email) {
		boolean isValid = email.matches("[a-z.]+.?[a-z]+@[a-z]+.[a-z]{1,5}");
		System.out.println("The value " + email +", " + "isValid = " + isValid);
	}

}

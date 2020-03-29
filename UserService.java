/**JavaAssignmentsUserService.java
 * author jkirkish
 *Jan 30, 2020
 */
package fileIO;

/**
 * @author jkirkish
 *
 */
public class UserService {

	public User isValidUser(String username1, String password1) {

		for (User user : userLogin.user) {
			if (user.getUsername().equals(username1) && user.getPassword().equals(password1)) {
				return user;
			}
		}
		return null;
	}
}

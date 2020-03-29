/**JavaAssignmentsUser.java
 * author jkirkish
 *Jan 25, 2020
 */
package fileIO;

/**
 * @author jkirkish POJO (Plain old Java Object)
 */
public class User {

	// instance variables
	private String username;
	private String password;
	private String name;

	/**
	 * @return the username
	 */
	public User(String[] user) {
		this.username = user[0];
		this.password = user[1];
		this.name = user[2];
	}

	public String getUsername() {
		if (username.equals(null)) {
			System.err.println("Username cannot be null!");
		}
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		if (username.equals(null)) {
			System.err.println("Username cannot be null!");
		} else {
			this.username = username;
		}
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		if (password.equals(null)) {
			System.err.println("Username cannot be null!");
		}
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		if (password.equals(null)) {
			System.err.println("Password cannot be null!");
		} else {
			this.password = password;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		if (name.equals(null)) {
			System.err.println("Username cannot be null!");
		}
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.equals(null)) {
			System.err.println("Username cannot be null!");
		} else {
			this.name = name;
		}
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + "]";
	}

}

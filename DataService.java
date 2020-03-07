/**JavaAssignmentsIdentificationService.java
 * author jkirkish
 *Feb 21, 2020
 */
package interfaces;

import java.io.File;
import java.io.IOException;

/**
 * @author jkirkish
 *an interface is a contract. You indicate the method
 *You do not define a method. It is abstract.
 *An abstract method does not define a body
 *default keyboard allows a body to be defined in a method
 *Implementing the interfaces use keyword implement.
 *You can implement as many interfaces as you want
 *public, static, and final are keywords to be used. You 
 *can't make it private.
 *Interfaces ared used for services and repositories
 */
public interface DataService {
	
	String standardFileName = "data.txt";
	
	String readLine(File file) throws IOException;
	
	void writeLine(File file, String line) throws IOException;
	
	
	

}

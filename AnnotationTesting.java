/**
 * 
 */
package testingBankAcconts;

/**
 * @author jkirkish
 *
 */
public class AnnotationTesting {
	
	@ThisAnnotate(enabled = false)
	public void test1() {
		if(true)
			throw new RuntimeException("This won't throw an exception as the test is disabled");
	}
	@ThisAnnotate
	public void test2() {
		if(true)
			throw new RuntimeException("This test failed!");
	}
	@ThisAnnotate
	public void test3() {
		System.out.println("This test should pass");
	}
}

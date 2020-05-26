/**
 * 
 */
package testingBankAcconts;

import java.lang.reflect.Method;

/**
 * @author jkirkish
 *
 */
public class AnnotationApp {
		
	public static void main(String[] args)
	{
		AnnotationTesting testing = new AnnotationTesting();
		Method[] methods = AnnotationTesting.class.getMethods();
		int testPass = 0;
		int testFailed = 0;
		int testIgnored = 0;
		
		for(Method method : methods) 
		{
			ThisAnnotate thisTest = method.getAnnotation(ThisAnnotate.class);
			
			if(thisTest != null) {
				try {
					if(thisTest.enabled()) {
						method.invoke(testing);
						testPass++;
					}else {
						testIgnored++;
					}
				}catch(Exception e) {
					testFailed++;
				}
			}
		}System.out.println("Tests passed:" + testPass + ", + tests failed " + testFailed + 
				", tests ignored: " + testIgnored);
	}
}
/**
 * 
 */
package testingBankAcconts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.crypto.Data;

import org.junit.jupiter.api.Test;



/**
 * @author jkirkish
 * Reflections look at its own code. Look at ifself and do something 
 * with that information. Repetitive code is shown. 
 */
public class ReflectionTests {
	EmployeeRepository employeeRepo = new EmployeeRepository();
	@Test
	public void reflection_test() {
		
		Employee employee = new Employee();
		employee.setName("Johnny");
		employee.setId(3456662);
		employee.setGender("Female");
		
		Method[] methods = employee.getClass().getMethods();
		
		for(Method method : methods) 
		{
			System.out.println(method.getName());
		}
		save(employee, employeeRepo);
	}
	
		
		public <T,R> void save (T obj, R repo) 
		{
			Class<T> d = (Class<T>) obj.getClass();
			
			try {
				Method saveMethod = repo.getClass().getMethod("save",d);
				saveMethod.invoke(repo,obj);
			}catch( NoSuchMethodException | SecurityException | IllegalAccessException
					| IllegalArgumentException| InvocationTargetException e) {
				System.err.println("There was an error invoking the save method");
			}
		}
		public void save (Employee employee)
		{
			EmployeeRepository employeeRepository = new EmployeeRepository();
			employeeRepository.save(employee);
		}
		
}

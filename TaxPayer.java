/**JavaAssignmentsTaxPayer.java
 * author jkirkish
 *Mar 22, 2020
 */
package collections;

/**
 * @author jkirkish
 *POJO Plain old Java Object
 */
public class TaxPayer {
	
	//instance variables
	private int ssn;
	private String name;
	private int age;
	public TaxPayer(int ssn, String name, int age) {
		
		this.ssn=ssn;
		this.name= name;
		this.age=age;
	}
	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "TaxPayer [ssn=" + ssn + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ssn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxPayer other = (TaxPayer) obj;
		if (ssn != other.ssn)
			return false;
		return true;
	}
	
}

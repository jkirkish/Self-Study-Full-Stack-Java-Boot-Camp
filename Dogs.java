/**JavaAssignmentsDogs.java
 * author jkirkish
 *Feb 28, 2020
 */
package howToSort;

/**
 * @author jkirkish
 *
 */
public class Dogs implements Comparable<Dogs>{
	
	//instance variables
	private String name;
	private Integer weight;
	
	Dogs(String name, Integer weight)
	{
		this.name = name;
		this.weight = weight;
	}
	/**
	 * @return the names
	 */
	public String getNames() {
		return name;
	}
	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		this.name = names;
	}
	/**
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	//sort through the weight of a group of people 
	@Override
	public int compareTo(Dogs that) {
		
		if(this.weight > that.weight) {
			return 1;
		}
		else if(this.weight.equals(that.weight)) {
			return 0;
		}
		else {
			return -1;
		}
	}

}

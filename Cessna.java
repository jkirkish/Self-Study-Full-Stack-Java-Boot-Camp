/**JavaAssignmentsCessna.java
 * author jkirkish
 *Feb 4, 2020
 */
package inheritance;

/**
 * @author jkirkish
 *
 */
public class Cessna extends BusinessJets{
	
	private String WingSpan;
	private String modelName;
	private double payLoad;
	
	public Cessna(int span, String name, double load) 
	{
	   super(name, name, load);
	   
	}

	/**
	 * @return the wingSpan
	 */
	public String getWingSpan() {
		return WingSpan;
	}

	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(String wingSpan) {
		WingSpan = wingSpan;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @return the payLoad
	 */
	public double getPayLoad() {
		return payLoad;
	}

	/**
	 * @param payLoad the payLoad to set
	 */
	public void setPayLoad(double payLoad) {
		this.payLoad = payLoad;
	}

	@Override
	public String toString() {
		return "Cessna [WingSpan=" + WingSpan + ", modelName=" + modelName + ", payLoad=" + payLoad + "]";
	}

}

/**JavaAssignmentsStealthUFO.java
 * author jkirkish
 *Feb 4, 2020
 */
package inheritance;

/**
 * @author jkirkish
 *
 */
public class StealthUFO extends Military{
	
	private boolean stealthCapable;
	private int wingSpan;
	private String make;
	/**
	 * @return the stealthCapable
	 */
	public boolean isStealthCapable() {
		return stealthCapable;
	}
	/**
	 * @param stealthCapable the stealthCapable to set
	 */
	public void setStealthCapable(boolean stealthCapable) {
		this.stealthCapable = stealthCapable;
	}
	/**
	 * @return the wingSpan
	 */
	public int getWingSpan() {
		return wingSpan;
	}
	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @param make
	 * @param model
	 * @param weapons
	 * @param stealthCapable
	 * @param wingSpan
	 * @param make2
	 */
	public StealthUFO(String make, String model, String weapons, boolean stealthCapable, int wingSpan, String make2) {
		super(make, model, weapons);
		this.stealthCapable = stealthCapable;
		this.wingSpan = wingSpan;
		make = make2;
	}
	

}

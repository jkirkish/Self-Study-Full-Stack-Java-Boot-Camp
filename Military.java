package inheritance;

public class Military extends Airplanes
{

	//instance variables
	private String make;
	private String model;
	private String weapons;
     
     /**
	 * @param make
	 * @param model
	 * @param weapons
	 */
	public Military(String make, String model, String weapons) {
		super();
		this.make = make;
		this.model = model;
		this.weapons = weapons;
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
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the weapons
	 */
	public String getWeapons() {
		return weapons;
	}
	/**
	 * @param weapons the weapons to set
	 */
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	@Override
	public String toString() {
		return "Military [make=" + make + ", model=" + model + ", weapons=" + weapons + "]";
	}
	
}

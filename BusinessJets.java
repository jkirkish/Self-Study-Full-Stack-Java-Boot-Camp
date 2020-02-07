package inheritance;

public class BusinessJets extends Airplanes{
	
	//instance variables
	private String model;
	private String make;
	private double costPerHour;
	
	public BusinessJets(String model, String make, double costPerHour) {
		super();
		this.model = model;
		this.make = make;
		this.costPerHour = costPerHour;
	}
	@Override
	public String toString() {
		return "BusinessJets [model=" + model + ", make=" + make + ", costPerHour=" + costPerHour + "]";
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
	 * @return the costPerHour
	 */
	public double getCostPerHour() {
		return costPerHour;
	}
	/**
	 * @param costPerHour the costPerHour to set
	 */
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

}

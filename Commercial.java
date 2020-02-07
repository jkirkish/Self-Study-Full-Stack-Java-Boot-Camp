package inheritance;

public class Commercial extends Airplanes{
	
	//ionstance variables
	private String make;
	private String model;
	private int numberOfSeats;
	/**
	 * @param make
	 * @param model
	 * @param numberOfSeats
	 */
	public Commercial(String make, String model, int numberOfSeats) {
		super();
		this.make = make;
		this.model = model;
		this.numberOfSeats = numberOfSeats;
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
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	public String toString() {
		return "Commercial [make=" + make + ", model=" + model + ", numberOfSeats=" + numberOfSeats + "]";
	}
	

}

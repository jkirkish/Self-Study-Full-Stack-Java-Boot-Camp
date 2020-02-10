package inheritance;

/*Inheritance shows how child classes inherit methods from parent classes
 * Parent class is a generic idea of a concept
 * CHild class describes a more specific form of that concept
 * Inheritance is used for code reuse
 * Is a relationship shows inheritance
 * has a relationship is a property
 * 
 */

public class Airplanes {
	
	private int range;
	private String typeAirplane;
	private int weight;
	private double fuelCapacity;
	
	
	public Airplanes() 
	{
		System.out.println("Inside the Airplane Constructor");
		range = 2500;
		typeAirplane = "Prototype";
		weight = 20000;
		fuelCapacity = 1000.00;
	}
	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}
	/**
	 * @return the typeAirplane
	 */
	public String getTypeAirplane() {
		return typeAirplane;
	}
	/**
	 * @param typeAirplane the typeAirplane to set
	 */
	public void setTypeAirplane(String typeAirplane) {
		this.typeAirplane = typeAirplane;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the fuelCapacity
	 */
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	/**
	 * @param fuelCapacity the fuelCapacity to set
	 */
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public void convertToGallons(double fuelPoundsToPutOn)
	{
		double gallons;
		//a gallon of jet fuel is 6.7lbs 
		gallons = fuelPoundsToPutOn * 6.7;
		System.out.println("Fuel to put on is " + gallons);
	}
	@Override
	public String toString() {
		return "Airplanes [range=" + range + ", typeAirplane=" + typeAirplane + ", weight=" + weight + ", fuelCapacity="
				+ fuelCapacity + "]";
	}
	

}

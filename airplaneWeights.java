/**JavaAssignmentsairplaneWeights.java
 * author jkirkish
 *Feb 8, 2020
 */
package inheritance;

/**
 * @author jkirkish
 *
 */
public class airplaneWeights extends Airplanes{
	
	private double payload;
	private double rampWeight;
	private double takeOffWeight;
	private double maxStructTakeoffWeight;
	private double landingWeight;
	private double maxStructLandWeight;
	private double passengerWeight;
	private double baggageWeight;
	private double fuelWeight;
	private double emptyWeight;
	/**
	 * @param payload
	 * @param rampWeight
	 * @param takeOffWeight
	 * @param maxStructTakeoffWeight
	 * @param landingWeight
	 * @param maxStructLandWeight
	 * @param passengerWeight
	 * @param baggageWeight
	 * @param fuelWeight
	 * @param emptyWeight
	 */
	public airplaneWeights(double payload, double rampWeight, double takeOffWeight, double maxStructTakeoffWeight,
			double landingWeight, double maxStructLandWeight, double passengerWeight, double baggageWeight,
			double fuelWeight, double emptyWeight) {
		super();
		this.payload = payload;
		this.rampWeight = rampWeight;
		this.takeOffWeight = takeOffWeight;
		this.maxStructTakeoffWeight = maxStructTakeoffWeight;
		this.landingWeight = landingWeight;
		this.maxStructLandWeight = maxStructLandWeight;
		this.passengerWeight = passengerWeight;
		this.baggageWeight = baggageWeight;
		this.fuelWeight = fuelWeight;
		this.emptyWeight = emptyWeight;
	}
	/**
	 * @return the payload
	 */
	public double getPayload() {
		return payload;
	}
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(double payload) {
		this.payload = payload;
	}
	/**
	 * @return the rampWeight
	 */
	public double getRampWeight() {
		return rampWeight;
	}
	/**
	 * @param rampWeight the rampWeight to set
	 */
	public void setRampWeight(double rampWeight) {
		this.rampWeight = rampWeight;
	}
	/**
	 * @return the takeOffWeight
	 */
	public double getTakeOffWeight() {
		return takeOffWeight;
	}
	/**
	 * @param takeOffWeight the takeOffWeight to set
	 */
	public void setTakeOffWeight(double takeOffWeight) {
		this.takeOffWeight = takeOffWeight;
	}
	/**
	 * @return the maxStructTakeoffWeight
	 */
	public double getMaxStructTakeoffWeight() {
		return maxStructTakeoffWeight;
	}
	/**
	 * @param maxStructTakeoffWeight the maxStructTakeoffWeight to set
	 */
	public void setMaxStructTakeoffWeight(double maxStructTakeoffWeight) {
		this.maxStructTakeoffWeight = maxStructTakeoffWeight;
	}
	/**
	 * @return the landingWeight
	 */
	public double getLandingWeight() {
		return landingWeight;
	}
	/**
	 * @param landingWeight the landingWeight to set
	 */
	public void setLandingWeight(double landingWeight) {
		this.landingWeight = landingWeight;
	}
	/**
	 * @return the maxStructLandWeight
	 */
	public double getMaxStructLandWeight() {
		return maxStructLandWeight;
	}
	/**
	 * @param maxStructLandWeight the maxStructLandWeight to set
	 */
	public void setMaxStructLandWeight(double maxStructLandWeight) {
		this.maxStructLandWeight = maxStructLandWeight;
	}
	/**
	 * @return the passengerWeight
	 */
	public double getPassengerWeight() {
		return passengerWeight;
	}
	/**
	 * @param passengerWeight the passengerWeight to set
	 */
	public void setPassengerWeight(double passengerWeight) {
		this.passengerWeight = passengerWeight;
	}
	/**
	 * @param passengerWeight the passengerWeight to set
	 * passenger where extra clothing in different locations
	 * due to the weather or time of season it is
	 */
	public void setPassengerWeight(double passengerWeight, double addedWeight) {
		this.passengerWeight = passengerWeight + addedWeight;
	/**
	 * @return the baggageWeight
	 */
	}/**
	 * @param passengerWeight the passengerWeight to set. The number of 
	 * passengers factors into the amount of passenger weight you have. 
	 * Also accounting for extra clothing or carryon bags. 
	 */
	public void setPassengerWeight(double passengerWeight,int paxQuantity, double addedWeight) {
		this.passengerWeight = (passengerWeight + addedWeight)* paxQuantity;
	}
	public double getBaggageWeight() {
		return baggageWeight;
	}
	/**
	 * @param baggageWeight the baggageWeight to set
	 */
	public void setBaggageWeight(double baggageWeight) {
		this.baggageWeight = baggageWeight;
	}/**
	 * @param baggageWeight the baggageWeight to set
	 */
	public void setBaggageWeight(double baggageWeight, int bags) {
		this.baggageWeight = baggageWeight * bags;
	}
	/**
	 * @return the fuelWeight
	 */
	public double getFuelWeight() {
		return fuelWeight;
	}
	/**
	 * @param fuelWeight the fuelWeight to set
	 */
	public void setFuelWeight(double fuelWeight) {
		this.fuelWeight = fuelWeight;
	}
	/**
	 * @return the emptyWeight
	 */
	public double getEmptyWeight() {
		return emptyWeight;
	}
	/**
	 * @param emptyWeight the emptyWeight to set
	 */
	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}
	@Override
	public String toString() {
		return "airplaneWeights [payload=" + payload + ", rampWeight=" + rampWeight + ", takeOffWeight=" + takeOffWeight
				+ ", maxStructTakeoffWeight=" + maxStructTakeoffWeight + ", landingWeight=" + landingWeight
				+ ", maxStructLandWeight=" + maxStructLandWeight + ", passengerWeight=" + passengerWeight
				+ ", baggageWeight=" + baggageWeight + ", fuelWeight=" + fuelWeight + ", emptyWeight=" + emptyWeight
				+ "]";
	}

}

package inheritance;

public class Boeing {

	private String model;
	private int engineThrust;
	private boolean APU;
	
	
	/**
	 * @param model
	 * @param engineThrust
	 * @param aPU
	 */
	public Boeing(String model, int engineThrust, boolean aPU) {
		super();
		this.model = model;
		this.engineThrust = engineThrust;
		APU = aPU;
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
	 * @return the engineThrust
	 */
	public int getEngineThrust() {
		return engineThrust;
	}
	/**
	 * @param engineThrust the engineThrust to set
	 */
	public void setEngineThrust(int engineThrust) {
		this.engineThrust = engineThrust;
	}
	/**
	 * @return the aPU
	 */
	public boolean isAPU() {
		return APU;
	}
	/**
	 * @param aPU the aPU to set
	 */
	public void setAPU(boolean aPU) {
		APU = aPU;
	}
	@Override
	public String toString() {
		return "Boeing [model=" + model + ", engineThrust=" + engineThrust + ", APU=" + APU + "]";
	}
	
	
}

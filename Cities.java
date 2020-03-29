package collections;

public class Cities {
	
	private String cityName;
	private String State;
	private int population;
	/**
	 * @param cityName
	 * @param state
	 * @param population
	 */
	public Cities(String cityName, String state, int population) {
		this.cityName = cityName;
		State = state;
		this.population = population;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + population;
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
		Cities other = (Cities) obj;
		if (State == null) {
			if (other.State != null)
				return false;
		} else if (!State.equalsIgnoreCase(other.State))
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equalsIgnoreCase(other.cityName))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cities [cityName=" + cityName + ", State=" + State + ", population=" + population + "]";
	}

}

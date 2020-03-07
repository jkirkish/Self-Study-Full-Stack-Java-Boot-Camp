package interfaces;


//defines at least one abstract method
public abstract class GenericFlightSchedule 
{
	//instance variables
	protected Integer takeOffs;
	protected Integer Landings;
	
	//abstract class has the keyword abstract in it along with an abstract method. 
	public abstract AirlineSchedule DepartureAndLandings(timeOfDay[]schedule);
	
	public Integer getTakeOffs() {
		return takeOffs;
	}
	
	public Integer getLandings() {
		return Landings;
	}
	
}

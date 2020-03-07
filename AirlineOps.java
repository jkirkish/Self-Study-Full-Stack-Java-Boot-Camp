package interfaces;

public class AirlineOps extends GenericFlightSchedule{

	//extends can only extend one class. you must also add unimplemented methods
	
	public AirlineOps() 
	{
		this.takeOffs = 25;
		this.Landings = 25;
	}
	
	@Override
	public AirlineSchedule DepartureAndLandings(timeOfDay[] schedule) {
		MorningHours morning = null;
		EveningHours evening = null;
		AirlineOps ops = null;
		
		for(timeOfDay schedules : schedule)
		{
			if(schedules instanceof AirlineOps) {
				ops = (AirlineOps)schedules;
			}else if(schedules instanceof EveningHours) {
				evening = (EveningHours)schedules;
			}else if(schedules instanceof MorningHours) {
				morning = (MorningHours)schedules;
			}
		}
		
		if(morning != null && evening != null && ops != null)
		{
			Airline airline = new Airline();
			airline.setEvening(evening);
			airline.setMorning(morning);
			airline.setOps(ops);
			return airline;
		}
		return null;
	}

}

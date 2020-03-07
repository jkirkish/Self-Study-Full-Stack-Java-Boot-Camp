/**JavaAssignmentsFlightScheduleApplication.java
 * author jkirkish
 *Feb 24, 2020
 */
package interfaces;

/**
 * @author jkirkish
 *
 */
public class FlightScheduleApplication {

	public static void main(String[] args) {
		
		GenericFlightSchedule flightSchedule = new AirlineOps();
		MorningHours morning = new MorningHours();
		EveningHours evening = new EveningHours();
		
		timeOfDay[]schedule = new timeOfDay[3];
		schedule[0] = morning;
		schedule[1] = evening;	
		
		flightSchedule.DepartureAndLandings(schedule);
		
		
	}

}

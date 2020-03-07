/**JavaAssignmentsAirline.java
 * author jkirkish
 *Feb 27, 2020
 */
package interfaces;

import java.util.Random;

/**
 * @author jkirkish
 *
 */
public class Airline implements AirlineSchedule{
	
	private MorningHours morning;
	private EveningHours evening;
	private AirlineOps ops;
	private Integer flights;
	/**
	 * @return the morning
	 */
	public MorningHours getMorning() {
		return morning;
	}
	/**
	 * @param morning the morning to set
	 */
	public void setMorning(MorningHours morning) {
		this.morning = morning;
	}
	/**
	 * @return the evening
	 */
	public EveningHours getEvening() {
		return evening;
	}
	/**
	 * @param evening the evening to set
	 */
	public void setEvening(EveningHours evening) {
		this.evening = evening;
	}
	/**
	 * @return the ops
	 */
	public AirlineOps getOps() {
		return ops;
	}
	/**
	 * @param ops the ops to set
	 */
	public void setOps(AirlineOps ops) {
		this.ops = ops;
	}
	@Override
	public Integer numberOfFlights() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		flights = ran.nextInt(2000);
		return flights;
	}

}

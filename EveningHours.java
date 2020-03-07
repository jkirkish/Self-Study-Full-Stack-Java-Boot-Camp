/**JavaAssignmentsEveningHours.java
 * author jkirkish
 *Feb 24, 2020
 */
package interfaces;

/**
 * @author jkirkish
 *
 */
public class EveningHours implements timeOfDay{

	private Integer hours;
	private Integer minutes;
	
	public EveningHours() {
		System.out.println("Evening runs from 12PM-1159PM");
	}

	@Override
	public String isItAMorPM() {
		
		return "PM";
	}

	@Override
	public Integer hours(Integer Hours) {
		if(Hours > 0 && Hours < 13)
		{
			this.hours = Hours;
		}
		return hours;
	}

	@Override
	public Integer minutes(Integer Minutes) {
		if(Minutes > 0 && Minutes < 13)
		{
			this.minutes = Minutes;
		}
		return minutes;
	}

	
}

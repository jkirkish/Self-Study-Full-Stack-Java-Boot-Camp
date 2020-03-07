/**JavaAssignmentsMorningHours.java
 * author jkirkish
 *Feb 24, 2020
 */
package interfaces;

/**
 * @author jkirkish
 * 02/24/2020
 */
public class MorningHours implements timeOfDay
{
	private Integer hours;
	private Integer minutes;
	
	public MorningHours() {
		System.out.println("Morning runs from 12AM-1159AM");
	}

	@Override
	public String isItAMorPM() {
		
		return "AM";
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

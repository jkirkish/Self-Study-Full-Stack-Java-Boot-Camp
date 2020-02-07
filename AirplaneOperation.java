/**JavaAssignmentsAirplaneOperation.java
 * author jkirkish
 *Feb 1, 2020
 */
package inheritance;

/**
 * @author jkirkish
 *
 */
public class AirplaneOperation {

	
	public static void main(String[] args) {
		
		Military military = new Military(null, null, null);
		military.setFuelCapacity(10000);
		military.setRange(5000);
		military.setWeight(750000);
		military.setTypeAirplane("StealthUFO");
		//the toString method is used from the parent class Airplanes
		System.out.println("Military: " + military.toString());
		
		Commercial comm = new Commercial(null, null, 0);
		comm.setRange(10000);
		comm.setFuelCapacity(5000);
		comm.setTypeAirplane("Boeing 787");
		comm.setWeight(500000);
		//the toString method is used from the parent class Airplanes
		System.out.println("Commercial Plane: " +comm.toString());
		
		BusinessJets bzjet = new BusinessJets(null, null, 0);
		bzjet.setFuelCapacity(2000);
		bzjet.setRange(3500);
		bzjet.setWeight(35680);
		bzjet.setTypeAirplane("Bombardier Challenger");
		//the toString method is used from the parent class Airplanes
		System.out.println("Business Jet: " +bzjet.toString());
	}

}

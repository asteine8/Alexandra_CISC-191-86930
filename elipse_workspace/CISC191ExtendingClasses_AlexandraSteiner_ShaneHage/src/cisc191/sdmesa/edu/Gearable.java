package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * @author Shane Hage
 * 
 * Other contributors:
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 1.2 - 2/27/22
 * 
 * Responsibilities of interface:
 * Specified methods relating to a mechanism with gears
 */

// [Implements] Gearable is implemented by ElectricMountainBike
public interface Gearable {
	/**
	 * @return the gear that object is currently in
	 */
	int getGear();
}

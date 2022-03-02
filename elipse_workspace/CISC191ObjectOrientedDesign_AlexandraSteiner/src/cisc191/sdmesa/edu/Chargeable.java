package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * Other contributors:
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.0 - 3/1/22
 * 
 * Responsibilities of class:
 * An interface to implement the properties of chargable things from
 */

public interface Chargeable {
	public int getBatteryCharge();
	public void chargeUp();
}

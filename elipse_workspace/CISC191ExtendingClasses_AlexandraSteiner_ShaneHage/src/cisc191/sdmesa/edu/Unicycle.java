package cisc191.sdmesa.edu;

import java.awt.Color;

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
 * Responsibilities of class:
 * A Unicycle is a Cycle with only one wheel
 */

 // [Is-A] Unicycle is a Cycle
public class Unicycle extends Cycle {
	
	private Color color; // [Has-A] Unicycle has a Color
	private final int numWheels = 1;
	
	/**
	 * establishes the make as well as the number of wheels on the unicycle
	 * @param newMake: the make of the unicycle
	 */
	public Unicycle (String newMake) {
		super(newMake);
	}

	/**
	 * changes the color of the unicycle
	 * @param newColor: the color of the unicycle
	 */
	
	// [Is-A] Unicycle is an Cycle. setColor(Color newColor) overrides the setColor(Color newColor) method in the Cycle class
	@Override
	public void setColor(Color newColor) {
		color = newColor;
	}

	/**
	 * returns the color of the unicycle
	 * @return the color of the unicycle
	 */
	
	// [Is-A] Unicycle is an Cycle. getColor() overrides the getColor() method in the Cycle class
	@Override
	public Color getColor() {
		return color;
	}

	/**
	 * returns the number of wheels on the unicycle
	 * @returns the number of wheels on the unicycle
	 */
	
	// [Is-A] Unicycle is an Cycle. getNumberOfWheels() overrides the getNumberOfWheels() method in the Cycle class
	@Override
	public int getNumberOfWheels() {
		return numWheels;
	}

}

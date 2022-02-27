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
 * Napmi (2013) How to access Abstract superclass instance variable. stackoverflow. 
 * Retrieved from: https://stackoverflow.com/questions/20051488/how-to-access-abstract-superclass-instance-variable
 *  
 * Version/date: 1.2 - 2/27/22
 * 
 * Responsibilities of class:
 * A Bicycle is a Cycle with two wheels. Implements abstact methods from the Cycle superclass. 
 */

 // [Is-A] Bicycle is a cycle
public class Bicycle extends Cycle {
	
	private Color color; // [Has-A] Bicycle has a Color
	private final int numWheels = 2;
	
	/**
	 * establishes the the make as well as the number of wheels of the bicycle
	 * @param newMake
	 */
	public Bicycle(String newMake) {
		super(newMake);
	}

	/**
	 * returns the number of wheels on a bicycle
	 * @return the number of wheels
	 */
	
	// [Is-A] Bicycle is an Cycle. getNumberOfWheels() overrides the getNumberOfWheels() method in the Cycle class
	@Override
	public int getNumberOfWheels() {
		return numWheels;
	}
	
	/**
	 * returns the color of the bicycle
	 * @return the bicycle's color
	 */
	
	// [Is-A] Bicycle is an Cycle. getColor() overrides the getColor() method in the Cycle class
	@Override
	public Color getColor() {
		return color;
	}
	
	/**
	 * changes the color of the bicycle
	 * @param newColor: the new color of the bicycle
	 */
	
	// [Is-A] Bicycle is an Cycle. setColor(Color newColor) overrides the setColor(Color newColor) method in the Cycle class
	@Override
	public void setColor(Color newColor) {
		color = newColor;
	}
}

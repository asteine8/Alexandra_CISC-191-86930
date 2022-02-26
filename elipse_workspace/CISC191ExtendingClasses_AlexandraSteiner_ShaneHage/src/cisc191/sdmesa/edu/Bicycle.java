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
 * Version/date: 1.0 - 2/25/22
 * 
 * Responsibilities of class:
 * A Bicycle is a Cycle with two wheels. Implements abstact methods from the Cycle superclass. 
 */
public class Bicycle extends Cycle {
	
	private String make;
	private Color color;
	private int numWheels;
	
	/**
	 * establishes the the make as well as the number of wheels of the bicycle
	 * @param newMake
	 */
	public Bicycle(String newMake) {
		super(newMake);
		
		make = newMake;
		numWheels = 2;
	}

	/**
	 * returns the number of wheels on a bicycle
	 * @return the number of wheels
	 */
	@Override
	public int getNumberOfWheels() {
		return numWheels;
	}
	
	/**
	 * returns the color of the bicycle
	 * @return the bicycle's color
	 */
	@Override
	public Color getColor() {
		return color;
	}
	
	/**
	 * changes the color of the bicycle
	 * @param newColor: the new color of the bicycle
	 */
	@Override
	public void setColor(Color newColor) {
		color = newColor;
	}
}

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
 * Miglani G. (October, 2021). final Keyword in Java. geeksforgeeks. Retrieved from: https://www.geeksforgeeks.org/final-keyword-in-java/
 *  
 * Version/date: 1.2 - 2/27/22
 * 
 * Responsibilities of class: Implements methods and fields related to a specific cycle. setMake and setColor will set the color and make of the cycle.
 * constructor establishes the make of the cycle. getmake and getColor will return the make and color of the cycle. getNumberOfWheels is a abstract 
 * method that will return the number of wheels for a cycle. getDescription will return the color, number of wheels and make of the cycle.
 * 
 */

// [Is-A] A Cycle is an Object
public abstract class Cycle  {
	
	private String make;
	
	/**
	 * establishes the make of the cycle
	 * @param newMake
	 */
	public Cycle(String newMake) {
		make = newMake;
	}

	/**
	 * abstract method that will return the number of wheels for the cycle
	 */
	abstract int getNumberOfWheels();

	/**
	 * returns the color of the cycle
	 * @return the color of the cycle; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the cycle
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * returns the make of the cycle
	 * @return make or brand that was set when the cycle was made
	 */
	final String getMake() {
		return make;
	}

	/**
	 * returns the color, number of wheels and make of the cycle as a toString
	 * @return
	 */
	public String getDescription() {
		return String.format("%s %d wheels %s", getMake(), getNumberOfWheels(), getColor().toString());
	}
}

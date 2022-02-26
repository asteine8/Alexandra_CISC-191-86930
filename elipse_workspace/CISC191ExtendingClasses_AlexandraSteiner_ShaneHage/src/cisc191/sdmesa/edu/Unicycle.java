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
 * Version/date: 1.0 - 2/25/22
 * 
 * Responsibilities of class:
 * A Unicycle is a Cycle with only one wheel
 */
public class Unicycle extends Cycle {
	/**
	 * establishes the make as well as the number of wheels on the unicycle
	 * @param newMake: the make of the unicycle
	 */
	public Unicycle (String newMake) {
		super(newMake);
		super.numWheels = 1;
	}

	/**
	 * changes the color of the unicycle
	 * @param newColor: the color of the unicycle
	 */
	@Override
	public void setColor(Color newColor) {
		super.color = newColor;
	}

	/**
	 * returns the color of the unicycle
	 * @return the color of the unicycle
	 */
	@Override
	public Color getColor () {
		return super.color;
	}

	/**
	 * returns the number of wheels on the unicycle
	 * @returns the number of wheels on the unicycle
	 */
	@Override
	public int getNumberOfWheels () {
		return super.numWheels;
	}

}

package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Shane Hage
 * @author Alexandra Steiner
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */
/**
 */
public class Boat
{
	private String make;
	private Color color;
	private int speed;
	private int price;
	private int serialNumber;
	
	// Iterates so we generate unique serial numbers
	private static int serialNumberIncrementer = 0;
	
	
	/**
	 * 
	 * @param m The make of the Boat
	 * @param c The color of the Boat
	 */
	public Boat(String m, Color c) {
		make = m;
		color = c;
		speed = 0;
		price = -1;
		
		serialNumber = createNewSerialNumber();
	}
	
	/**
	 * Default Boat Constructor
	 */
	public Boat() {
		make = null;
		color = null;
		speed = 0;
		price = -1;
		
		serialNumber = createNewSerialNumber();
	}
	
	

	/**
	 * Gets the maker of the boat
	 * @return make
	 */
	public String getMake()
	{
		return make;
	}

	/**
	 * Gets the color of the boat
	 * @return color
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Sets a new color for the boat
	 */
	public void setColor (Color newColor) {
		newColor = color;		
	}
	
	/**
	 * Gets the speed of the boat
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Increments the speed by 1.
	 */
	public void speedUp() {
		speed++;
	}

	/**
	 * Decreases the speed by 1.
	 */
	public void slowDown() {
		speed = speed - 1; 
	}
	
	/**
	 * Gets the price of the boat
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Set the price of the boat
	 * @param price
	 */
	public void setPrice(int p) {
		price = p;
	}
	
	/**
	 * Returns the Serial Number
	 * @return serial number
	 */
	public int getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * Generates a new serial number and increments up the serial number after generation
	 * @return a serial number
	 */
	public static int createNewSerialNumber() {
		serialNumberIncrementer++;
		return serialNumberIncrementer;
	}
	
	/**
	 * Compares make and color between two boats and returns true if the makes and colors match
	 * Returns false if the boat or its color / make are null
	 * 
	 * @param otherBoat: the other boat to compare with this boat
	 * @return true if the makes and colors match
	 */
	public boolean equals (Boat otherBoat) {
		// return false if *SOMEONE* passes us a null boat
		if (otherBoat == null) return false;
		
		// return false if *SOMEONE* passes us an empty boat
		if (otherBoat.getColor() == null || otherBoat.getMake() == null) return false;
		
		// return true if colors and makes both match
		return otherBoat.getColor().equals(color) && otherBoat.getMake().equals(make);
	}
	
	/**
	 * Returns a formatted string representing the make and color of this boat
	 * Referenced https://www.javatpoint.com/java-string-format
	 * @return the formatted string
	 */
	@Override
	public String toString() {
		return String.format("Boat: make: %s color: %s", make, color.toString());
	}
}

package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Shane Hage
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Java T Point (2021). Java String format(). javatpoint.com. Retrieved from: https://www.javatpoint.com/java-string-format
 *  
 * Oracle (2020) Class Object. docs.oracle.com. Retrieved from https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
 * 
 * Webucator (2022) How to Check Object Type in Java. webucator.com. Retrieved from https://www.webucator.com/article/how-to-check-object-type-in-java/
 * 
 * Sreedharan R. (2011) Convert or Cast a Simple Object to Object of another class. Stack Overflow. Retrieved from https://stackoverflow.com/questions/7256393/convert-or-cast-a-simple-object-to-object-of-another-class
 * 
 * Version/date: 1.2 - 2/20/2022
 * 
 * Responsibilities of class:
 * Implementation of the Boat class to match the specified UML diagram for this assignment. Contains make,
 * color, speed, price, and serialNumber. Automatically assigns unique serial numbers to new boats and contains
 * QOL getters, setters, and other general methods to support the class.
 * 
 */
public class Boat {
	private String make;
	private Color color;
	private int speed;
	private int price;
	private int serialNumber;
	
	// A static serial number that iterates so we generate unique serial numbers
	// Because its static, the value is independent of boat instance
	private static int serialNumberIncrementer = 0;
	
	/**
	 * Constructs a boat with the provided make and color. Sets price and speed to their default values.
	 * Assigns the boat a serial number
	 * 
	 * @param make The make of the Boat
	 * @param color The color of the Boat
	 */
	public Boat(String make, Color color) {
		this.make = make;
		this.color = color;
		speed = 0;
		price = -1;
		
		serialNumber = createNewSerialNumber();
	}
	
	/**
	 * Default Boat Constructor:
	 * Assigns make, color, speed, and price to their default values and gives the boat a serial number
	 */
	public Boat() {
		make = null;
		color = null;
		speed = 0;
		price = -1;
		
		serialNumber = createNewSerialNumber();
	}

	/**
	 * Gets the make of the boat
	 * @return make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Gets the color of the boat
	 * @return color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Sets a new color for the boat
	 * @param newColor: the color to set the boat to
	 */
	public void setColor (Color newColor) {
		color = newColor;
	}
	
	/**
	 * Gets the speed of the boat
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Increments the speed by 1.
	 */
	public void speedUp() {
		speed++;
	}

	/**
	 * Decrements the speed by 1.
	 */
	public void slowDown() {
		speed--;
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
	 * Compares make and color between the provided object and this boat and returns true if the makes and 
	 * colors match. Returns false if the boat or its color / make are null or if the provided object is
	 * not a Boat
	 * 
	 * Referenced for override: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
	 * 
	 * Referenced for instanceof: https://www.webucator.com/article/how-to-check-object-type-in-java/
	 * 
	 * Referenced for object casting: https://stackoverflow.com/questions/7256393/convert-or-cast-a-simple-object-to-object-of-another-class
	 * 
	 * @param obj: an object to be casted into a boat object and compared with another boat
	 * @return true if the obj is of the Boat type and its make and color match this boat
	 */
	@Override
	public boolean equals (Object obj) {
		// return false if *SOMEONE* passes us a null object
		if (obj == null) return false;
		
		// Check if the provided object is actually a boat. Return false if its not
		if (!(obj instanceof Boat)) return false;
		
		// Cast the provided object as a Boat
		Boat otherBoat = (Boat) obj;
		
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

package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Shane Hage
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.0 - 2/17/2022
 * 
 * Responsibilities of class: Holds a person's name, phone number and zip code. Can return the person's name through the getName method and
 * return all the person's information using the toString method.
 * 
 */
public class Person {
	private String name;
	private String phone;
	private String zip;
	
	/**
	 * Constructs a new Person with the person's name, phone number, and zip code
	 * 
	 * @param name: the name of the person
	 * @param phone: the phone number for the person
	 * @param zip: the zipcode where the person lives
	 */
	Person(String name, String phone, String zip) {
		this.name = name;
		this.phone = phone;
		this.zip = zip;
	}
	
	/**
	 * Will return the person's name.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Will return formatted string of the person's name, phone number and zipcode. 
	 * @return the formatted string
	 */
	@Override
	public String toString() {
		return String.format("%s %s %s", name, phone, zip);
	}
}

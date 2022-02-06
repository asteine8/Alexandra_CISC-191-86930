package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author 
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
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
public class M2ArrayChallenge
{
	/**
	 * Purpose: Determines if an array contains a value
	 * This function iterates through an array and checks each element
	 * against the specified value, If the specified value is found, return
	 * true. Otherwise, return false;
	 * 
	 * @param array: the array to search
	 * @param value: the value to look for in the array
	 * @return true if array contains value, otherwise returns false
	 */
	public static boolean contains(int[] array, int value)
	{
		// Iterate through array
		for (int a : array) {
			
			// Return true if the value is found
			if (a == value) {
				return true;
			}
		}
		
		// Returns false otherwise
		return false;
	}
	
	/**
	 * Purpose: Returns the index of the first instance of value in an array
	 * @param array: the array to search
	 * @param value: the value to look for in the array
	 * @return the index of the first instance of value in the array. Will return -1 if no instances are found
	 */
	public static int find(int[] array, int value) {
		
		// Iterate through array
		for (int i = 0 ; i < array.length; i++) {
			
			// Return current index if value is found in array
			if (array[i] == value) {
				return i;
			}
		}
		
		// If no instances are found, return -1
		return -1;
	}
	
	

}

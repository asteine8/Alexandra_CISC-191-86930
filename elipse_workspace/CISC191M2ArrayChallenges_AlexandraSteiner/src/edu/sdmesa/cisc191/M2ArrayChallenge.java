package edu.sdmesa.cisc191;

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
 * <<add more references here>>
 *  
 * Version/date: 
 * 0.1 - 2/6/22
 * 
 * Responsibilities of class:
 * Implements a variety of common array functions.
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
	
	/**
	 * Purpose: Counts the number of times a provided character value can be 
	 * found in an array of characters
	 * This function iterates through the provided array and checks each array 
	 * element against a provided value. Adds one to the number of instances found
	 * when a match is found.
	 * 
	 * @param array: the array to count characters in
	 * @param value: a character to search the array for
	 * @return the number of instances the provided value was found in the array
	 */
	public static int countValues(char[] array, int value) {
		// Start with no instances found to handle an empty array or no instances found
		int numInstances = 0;
		
		// Iterate through the array
		for (char c : array) {
			
			// Check each character against value and iterate count when a match is found
			if (c == value) {
				numInstances++;
			}
		}
		
		return numInstances;
	}

}

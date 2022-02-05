package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 
 * Version 0.1 - 2/4/22
 * 
 * Responsibilities of class:
 * A helper class containing several common array operations
 */
public class ArrayChallenge
{
	/**
	 * Purpose: Find the largest element in the array given
	 * 
	 * @param array to search
	 * @return largest element
	 */
	public static int max(int[] array)
	{
		int currentMax = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > currentMax) {
				currentMax = array[i];
			}
		}
		
		return currentMax;
	}
	
	/**
	 * Purpose: Finds the smallest integer in an array
	 * 
	 * @param array
	 * @return the smallest element
	 */
	public static int min(int[] array) {
		int currentMin = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < currentMin) {
				currentMin = array[i];
			}
		}
		
		return currentMin;
	}
	
	/**
	 * Purpose: Returns the sum of an array
	 * 
	 * @param array
	 * @return sum of array
	 */
	public static int sum(int[] array) {
		int total = 0;
		
		for (int a : array) {
			total += a;
		}
		
		return total;
	}
	
	/**
	 * Purpose: Returns the average of an array
	 * 
	 * @param array
	 * @return average of array
	 */
	public static double average(int[] array) {
		return (double)sum(array) / array.length;
	}
	
	/**
	 * Purpose: Returns the median of an array
	 * 
	 * @param array
	 * @return the median of array
	 */
	public static int median(int[] array) {
		// Case for even number of elements
		if (array.length % 2 == 0) {
			return (array[array.length/2-1]+array[array.length/2]) / 2;
		}
		// Case for odd number of elements
		else {
			return array[array.length/2];
		}
	}

}

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
	 * This function uses a simple check and hold method to get the
	 * largest value in an array. Each element is checked against the
	 * currently held max value and assigned as the max value if larger
	 * 
	 * @param array to search
	 * @return largest element
	 */
	public static int max(int[] array)
	{
		// Start by assigning the first element as our largest value
		// Handles the case where there is only one element in the array
		int currentMax = array[0];
		
		// Iterate through array range [1,N)
		for (int i = 1; i < array.length; i++) {
			// Test against current max
			if (array[i] > currentMax) {
				// Reassign current max if array element is larger
				currentMax = array[i];
			}
		}
		
		return currentMax;
	}
	
	/**
	 * Purpose: Finds the smallest integer in an array
	 * This function uses a simple check and hold method to get the
	 * smallest value in an array. Each element is checked against the
	 * currently held min value and assigned as the min value if smaller
	 * 
	 * @param array
	 * @return the smallest element
	 */
	public static int min(int[] array) {
		
		// Start by assigning the first element as our smallest value
		// Handles the case where there is only one element in the array
		int currentMin = array[0];
		
		// Iterate through array range [1,N)
		for (int i = 1; i < array.length; i++) {
			// Test against current min
			if (array[i] < currentMin) {
				// Reassign current min if array element is larger
				currentMin = array[i];
			}
		}
		
		return currentMin;
	}
	
	/**
	 * Purpose: Returns the sum of an array
	 * Iterates through each element of the array and adds it
	 * to a running total
	 * 
	 * @param array
	 * @return sum of array
	 */
	public static int sum(int[] array) {
		int total = 0;
		
		// Iterates through array, passing each element to 'a' each loop
		for (int a : array) {
			total += a;
		}
		
		return total;
	}
	
	/**
	 * Purpose: Returns the average of an array
	 * where N is the number of elements in the array, the average
	 * is the sum/N. Uses the sum method to simplify code
	 * 
	 * @param array
	 * @return average of array
	 */
	public static double average(int[] array) {
		// Casts sum as a double since the average can be
		// a decimal number. This implicitly casts the
		// result of the divide operator as a double
		return (double)sum(array) / array.length;
	}
	
	/**
	 * Purpose: Returns the median of an array
	 * Calculates median piecewise for even and odd N where
	 * N is the number of elements in the array
	 * 
	 * In case N is even:
	 * median = average of array elements at indexes N/2 and N/2-1
	 * 
	 * In case N is odd:
	 * median = array element at index N/2 rounded down
	 * Since N/2 is an integer division, the result is automatically
	 * rounded down
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

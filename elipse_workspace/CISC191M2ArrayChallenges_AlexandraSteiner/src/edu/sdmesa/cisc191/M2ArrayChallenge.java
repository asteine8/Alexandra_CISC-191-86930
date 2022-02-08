package edu.sdmesa.cisc191;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

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
 *  
 * Version/date: 
 * 1.1 - 2/6/22
 * 
 * Responsibilities of class:
 * Implements a variety of common array functions.
 */

public class M2ArrayChallenge {
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
	public static boolean contains(int[] array, int value) {
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
	 * Purpose: Sorts the provided array using the bogosort algorithm
	 * Please see https://en.wikipedia.org/wiki/Bogosort for information on the algorithm
	 * 
	 * @param array: the array to sort
	 * @return the sorted array, eventually...
	 */
	public static int[] bogoSort(int[] array) {
		int [] newArray = copy(array);
		
		// Continue shuffling while the array is not in order (I will have order)
		while (!inOrder(newArray)) {
			
			// Implement a Fisher-Yates shuffle (https://rosettacode.org/wiki/Knuth_shuffle)
			for (int i = newArray.length-1; i > 0; i--) {
				
				// Generate a random index in range [0, i]
				int j = ThreadLocalRandom.current().nextInt(0, i+1);
				
				// Swap elements at i and j
				int temp = newArray[i];
				newArray[i] = newArray[j];
				newArray[j] = temp;
			}
		}
		
		return newArray;
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
	
	/**
	 * Purpose: Checks if an integer array is in ascending order
	 * Let i be iterated in range (1,N) where N is the number of elements in this array
	 * This function checks if the value of array at i and i-1 are in ascending order
	 * and will return false if any pair of elements are out of order
	 * 
	 * @param array: the array to check for order
	 * @return true if array is in order, false otherwise
	 */
	public static boolean inOrder(int[] array) {
		
		// Iterate through the array. Starting at 1 also handles case where N=0
		for (int i = 1; i < array.length; i++) {
			
			// Check each pair of values in the array for ascending order
			if (array[i-1] > array[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Purpose: Performs a single bubble sort iteration
	 * 
	 * @param array: the array to perform a single bubble sort on
	 * @return the array after a single bubblesort iteration
	 */
	public static int[] bubbleUp(int[] array) {
		
		// Iterate through array
		for (int i = 1; i < array.length; i++) {
			
			// Swap pair of elements if not in order
			if (array[i-1] > array[i]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			}
		}
		
		return array;
	}
	
	/**
	 * Purpose: A standard bubble sort algorithm to sort an integer array in ascending order
	 * 
	 * @param array: the array to be sorted
	 * @return the sorted array in ascending order
	 */
	public static int[] bubbleSort(int[] array) {
		
		// Start at -1 so the while loop executes
		int swaps = -1;
		
		// Continue sorting until there are no swaps being performed
		while (swaps != 0) {
			
			// Start at 0 swaps each bubble-up iteration
			swaps = 0;
			
			// Iterate through array
			for (int i = 1; i < array.length; i++) {
				
				// Swap pair of elements if not in order
				if (array[i-1] > array[i]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					
					// Since we performed a swap, iterate the swap counter
					swaps++;
				}
			}
		}
		
		return array;
	}
	
	/**
	 * Purpose: Copies a character array into a new array with a separate memory location
	 * 
	 * @param array: the array to be copied
	 * @return a new array with the same contents
	 */
	public static char[] copy(char[] array) {
		
		// Allocates memory for a new array
		char[] newArray = new char[array.length];
		
		// Iterates through both arrays and copies values from array to newArray
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		// Return the new array
		return newArray;
	}
	
	/**
	 * Purpose: Copies an integer array into a new array with a separate memory location
	 * 
	 * @param array: the array to be copied
	 * @return a new array with the same contents
	 */
	public static int[] copy(int[] array) {
		
		// Allocates memory for a new array
		int[] newArray = new int[array.length];
		
		// Iterates through both arrays and copies values from array to newArray
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		// Return the new array
		return newArray;
	}
	
	/**
	 * Purpose: Reverses a provided array
	 * Copies elements from the provided array into a new array in inverse order (the first element
	 * of array is assigned to the last element of the new array)
	 * 
	 * @param array: the array to copy and reverse
	 * @return the reversed array
	 */
	public static char[] backwards(char[] array) {
		// Allocate memory for a new array
		char[] newArray = new char[array.length];
		
		// Iterate through array
		for (int i = 0; i < array.length; i++) {
			
			// Assign elements from the array into newArray in inverse order
			newArray[i] = array[array.length-1-i];
		}
		
		return newArray;
	}
	
	/**
	 * Purpose: Checks if a provided array is a palindrome
	 * Let i iterate from 0 to N/2 rounded down where N is the length of the provided array
	 * This function compares the value i spaces from the start of the array and the value i
	 * spaces from the end of the array. If these two values do not match, the array cannot be
	 * a palindrome
	 * 
	 * Note: This could be accomplished by using the backwards method to reverse the array and check it
	 * against the original array, but doing it this way is more efficient since you don't have to reverse
	 * then check the array.
	 * 
	 * @param array: the array to check if it is a palindrome
	 * @return True if the provided array is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(char[] array) {
		
		// Handle edge case where array is empty
		if (array.length == 0) return true;
		
		// Iterate through first half of array (excluding center element if array has an odd number of elements
		for (int i = 0; i < array.length/2; i++) {
			
			// Check to see if the elements i places from the start and end of array are not the same
			if (array[i] != array[array.length-1-i]) {
				
				// Elements do not match, this array is not a palindrome
				return false;
			}
		}
		
		// All elements did match, this array is a palindrome
		return true;
	}
	
	/**
	 * Purpose: Returns the value of the 2 dimensional array at the specified row and column
	 * 
	 * @param array: the array to get the value from
	 * @param row: the row to get the value from
	 * @param col: the column to get the value from
	 * @return the value of array at (row,col)
	 */
	public static int getElement(int[][] array, int row, int col) {
		return array[row][col];
	}
	
	/**
	 * Purpose: Calculates the sum of a 2d array's row
	 * This function adds each value in the specified row to a running total
	 * 
	 * @param array: the array to calculate the sum from
	 * @param row: the row to sum
	 * @return the sum of the row
	 */
	public static int sumRow(int[][] array, int row) {
		int runningTotal = 0;
		
		// Iterate through range [0, row length)
		for (int i = 0; i < array[row].length; i++) {
			
			// Add elements in the specified row to the total
			runningTotal += getElement(array, row, i);
		}
		
		return runningTotal;
	}
	
	/**
	 * Purpose: Calculates the sum of a 2d array's column
	 * This function adds each value in the specified column to a running total
	 * 
	 * @param array: the array to calculate the sum from
	 * @param col: the column to sum
	 * @return the sum of the column
	 */
	public static int sumColumn(int[][] array, int col) {
		int runningTotal = 0;
		
		// Iterate through range [0, col length)
		for (int i = 0; i < array.length; i++) {
			
			// Add elements in the specified column to the total
			runningTotal += getElement(array, i, col);
		}
		return runningTotal;
	}
	
	/**
	 * Purpose: Calculates the sum of elements across a square matrix's top left to bottom right diagonal
	 * Let N be the size of the provided square matrix and let i iterate in range [0, N)
	 * This function adds each value array[i, i] to a running total
	 * 
	 * @param array: the array to calculate the diagonal from
	 * @return the sum of the diagonal
	 */
	public static int sumLeftToRightDiagonal(int[][] array) {
		int runningTotal = 0;
		
		// Iterate through range [0, N)
		for (int i = 0; i < array.length; i++) {
			
			// Add elements on the top left to bottom right diagonal
			runningTotal += getElement(array, i, i);
		}
		return runningTotal;
	}
	
	/**
	 * Purpose: Calculates the sum of elements across a square matrix's bottom left to top right diagonal
	 * Let N be the size of the provided square matrix and let i iterate in range [0, N)
	 * This function adds each value array[i, N-1-i] to a running total
	 * 
	 * @param array: the array to calculate the diagonal from
	 * @return the sum of the diagonal
	 */
	public static int sumRightToLeftDiagonal(int[][] array) {
		int runningTotal = 0;
		
		// Iterate through range [0, N)
		for (int i = 0; i < array.length; i++) {
			
			// Add elements on the bottom left to top right diagonal
			runningTotal += getElement(array, i, array.length-1-i);
		}
		return runningTotal;
	}
	
	/**
	 * Purpose: Calculates the sum of the rightmost elements on each row
	 * This function iterates through every row in the array and adds the last element to a running total
	 * 
	 * @param array: the array to calculate the sum from
	 * @return the sum of each rightmost element
	 */
	public static int sumLastRowElements(int[][] array) {
		int runningTotal = 0;
		
		// Iterate through the array
		for (int i = 0; i < array.length; i++) {
			
			// Add the last element on the row to the running total
			runningTotal += getElement(array, i, array[i].length-1);
		}
		
		return runningTotal;
	}
	
}

package cisc191.sdmesa.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
 * 
 * Krishna M. (October 2019). How to read the contents of a webpage into a string in java?
 * Retrieved from https://www.tutorialspoint.com/how-to-read-the-contents-of-a-webpage-into-a-string-in-java
 * 
 * Leary S. (2016). Class JSONObject. Github Pages. Retrieved from:
 * https://stleary.github.io/JSON-java/org/json/JSONObject.html
 * 
 * Used the org.json library which is attributed to Sean Leary:
 * Github Source: https://github.com/stleary/JSON-java
 *  
 * Version/date: 1.0 3-23-22
 * 
 * Responsibilities of class:
 * Implements three common IO utility functions
 */
public class IO {
	/**
	 * Attempts to get the contents of the file at filePath as a String
	 * @param filePath
	 * @return the contents of the file at filePath as a String
	 */
	public static String readTestResults(String filePath) {
		// Create a StringBuffer to buffer in text from the specified file
		StringBuffer contents = new StringBuffer();
		
		try {
			// Create a new scanner at the filePath
			Scanner scanner = new Scanner(new File(filePath));
			
			// Read all text from the file
			while (scanner.hasNext()) {
				contents.append(scanner.next());
			}
			
			// Close the scanner since we don't need it
			scanner.close();
		} catch (FileNotFoundException e) {
			return ""; // Return an empty string since there is no text to return
		}
		
		return contents.toString();
	}
	
	/**
	 * Attempts to append textToAppend to the file at filePath. If no file exists, creates a
	 * new file with the specified path
	 * @param filePath
	 * @param textToAppend
	 * @return true if the text was appended, false if the text could not be written
	 */
	public static boolean appendTestResult(String filePath, String textToAppend) {
		// Create a new file using the provided filePath
		File file = new File(filePath);
		
		// Create new file if it does not exist yet
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				return false;
			}
		}
		
		try {
			// Create a new PrintStream set to append to the file
			PrintStream pStream = new PrintStream(new FileOutputStream(file, true));
			
			// Append text
			pStream.print(textToAppend);
			
			// Flush pStream data to file
			pStream.flush();
			
			// Close the stream since its not used anymore
			pStream.close();
		} catch (FileNotFoundException e) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Retrieves the datetime from urlSource. urlSource is expected to contain data in a
	 * json format. Will retrieve the value at the 'datetime' key
	 * @param urlSource
	 * @return the datetime string
	 */
	public static String readDateTime(String urlSource) {
		// dateTime is an empty string by default
		String dateTime = "";
		
		try {
			// Create a new scanner at the specified url
			Scanner scanner = new Scanner((new URL(urlSource)).openStream());
			
			// Create a StringBuffer to buffer in the data read from the url
			StringBuffer contents = new StringBuffer();
			
			// Read all contents at the url and append them to contents
			while (scanner.hasNext()) {
				contents.append(scanner.next());
			}
			
			// Close the scanner since we don't need it
			scanner.close();
			
			// Parse json contents and extract 'datetime' entry
			// Create a new JSONObject from the json text
			JSONObject json = new JSONObject(contents.toString());
			
			// Retrieve the string at the 'datetime' key
			dateTime = json.getString("datetime");
		
		} catch (MalformedURLException e) {
			return dateTime;
		} catch (IOException e) {
			return dateTime;
		}
		
		return dateTime;
	}
}

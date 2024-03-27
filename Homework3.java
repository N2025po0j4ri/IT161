/**
 * 
 */

/**
 ** @author  Nirupama Poojari
* @version 4.22
* @since   2021-12
 */
import java.io.*;
public class Homework3 {
	/**
	 * @param args
	 */
	public static void main( String astrCommandLine[ ] )
	{
		// --------------------------------------------------------------------------------
		// Problem 1: Age in seconds
		// --------------------------------------------------------------------------------
		
		//		1	Calculating the number of seconds in a day/
		 int hourPerDay = 24;
		 int minutesPerDay = hourPerDay*60;
		 int secondsPerDay = minutesPerDay*60;
		 //2	Calculating how many days you’ve been alive by multiplying the number of years 
		 //since you were born by 365.
		 System.out.print("Enter your age: ");
		 int userAge = ReadIntegerFromUser();
		 int daysAlive = userAge*365;
		 //3	Multiply the number of days you’ve been alive by the number of seconds per day 
		 //and print the result.
		 float secondsAlive = daysAlive * secondsPerDay;
		 System.out.print("Age in seconds : " + secondsAlive + "\n");
		//…
		// --------------------------------------------------------------------------------
		// Problem 2: Volume of Sun, Earth and ratio of the two
		// --------------------------------------------------------------------------------
		//< your code here>
		 int sunDiameter = 865000;
		 int earthDiameter = 7600;
		 float sunRadius = sunDiameter/2;
		 float earthRadius = earthDiameter/2;
		 float sunVolume = (float) (3.14 * sunRadius * sunRadius * sunRadius * 4.0/3.0);
		 float earthVolume = (float)(3.14 * earthRadius * earthRadius * earthRadius * 4.0/3.0);
		 float ratioSunVolumeEarthVolume = sunVolume/earthVolume;
		 System.out.print("Ratio of Sun volume to Earth volume : "+ ratioSunVolumeEarthVolume + "\n");
		//…
		// --------------------------------------------------------------------------------
		// Problem 3: Number of molecules in 2.45 quarts of water.
		// --------------------------------------------------------------------------------
		 float quarts = (float)(2.45);
		 float mass = (float)(3E-23);
		 float grams = 950;
		 float quartsWater = quarts * grams;
		 float molecules = quartsWater / mass;
		 System.out.print("Number of molecules in 2.45 quarts of water : " + molecules);
		//…
		 
	}
	
	public static int ReadIntegerFromUser( )
	{
		int intValue = 0;
		try
		{
			String strBuffer = "";
			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;
			// Read a line from the user
			strBuffer = burInput.readLine( );
			// Convert from string to integer
			intValue = Integer.parseInt( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}
		// Return integer value
		return intValue;
	}


}

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* @author  Nirupama Poojari
* @version 4.22
* @since   2021-12
 */
public class PayCheckNP {

	/**
	 * Homework: Methods & Passing Parameters
	 * Method: Main
	 * Abstract: Calculate the paychecks
	*/
	public static void main(String[] args) {
		// Variables/Loop/Conditions 
		float hours =0;
		float payRate = 0;
		do{
			System.out.print("Please enter number of hours worked or 0 to end program: ");
			hours = ReadFloatFromUser();
			if (hours == 0) {
				break;
			}
			System.out.print("Please enter the payrate or 0 to end program: ");
			payRate = ReadFloatFromUser();
			if(payRate == 0) {
				break;
			}
			//Display the Output
			System.out.print("Your Gross Pay is ---> ");
			float calculatedPay = calculatePay(hours, payRate);
			System.out.printf("%.2f", calculatedPay); 
			System.out.print("\n");
			float calculateTaxFederal = calculateTaxFederal(calculatedPay);
			System.out.print("Federal is ----------> ");
			System.out.printf("%.2f", calculateTaxFederal);
			System.out.print("\n");
			float calculateTaxState = calculateTaxState(calculatedPay);
			System.out.print("State Tax is -------->  ");
			System.out.printf("%.2f", calculateTaxState);
			System.out.print("\n");
			float calculateTaxLocal = calculateTaxLocal(calculatedPay);
			System.out.print("Local Tax is -------->  ");
			System.out.printf("%.2f", calculateTaxLocal);
			System.out.print("\n");
			float calculateTaxFICA = calculateTaxFICA(calculatedPay);
			System.out.print("FICA Tax is --------->  ");
			System.out.printf("%.2f", calculateTaxFICA);
			System.out.print("\n");
			float netPay = calculatedPay - calculateTaxFederal - calculateTaxState - calculateTaxLocal - calculateTaxFICA; 
			System.out.print("------------------------------");
			System.out.print("\n");
			System.out.print("Net Pay is: ");
			System.out.printf( "%.2f", netPay);
			System.out.print("\n\n");
		} while(hours != 0 || payRate != 0);
		System.out.print("\nPay Check Calculator Program Ended");
	    	
	
	}
	/**
	 * Method: calculatePay
	 * @param: hoursWorked, payRate
	 * return:pay
	 */
	public static float calculatePay(float hoursWorked, float payRate) {
		float pay= 0;
		float overTimePay = 0;
		if (hoursWorked <= 40) {
			pay= hoursWorked*payRate;
		}
		else {
			float overTime = hoursWorked - 40;
			float overTimeRate = (float) (1.5*payRate);
			overTimePay= overTime* overTimeRate;
			pay= 40*payRate + overTimePay;
		}
		return pay;
	}
	/**
	 * Method: calculateTaxFederal
	 * @param: grossPay
	 * return: fedTax
	 */
	public static float calculateTaxFederal(float grossPay) {
		float fedTax = 0;
		fedTax = (float)(grossPay * 0.25);
		return fedTax;
	}
	/**
	 * Method: calculateTaxState
	 * @param: grossPay
	 * return: stateTax
	 */
	public static float calculateTaxState(float grossPay) {
		float stateTax = 0;
		stateTax = (float)(grossPay * 0.07);
		return stateTax;
	}
	/**
	 * Method: calculateTaxLocal
	 * @param: grossPay
	 * return: localTax
	 */
	public static float calculateTaxLocal(float grossPay) {
		float localTax = 0;
	    localTax = (float)(grossPay * 0.025);
		return localTax;
	}
	/**
	 * Method: calculateTaxFICA
	 * @param: grossPay
	 * return: ficaTax
	 */
	public static float calculateTaxFICA(float grossPay) {
		float ficaTax = 0;
	    ficaTax = (float)(grossPay * 0.0475);
		return ficaTax;
	}
	/**
	 * Method: ReadFloatFromUser
	 * @param: none
	 * return: floatValue
	 */
	public static float ReadFloatFromUser( )
	{

		float floatValue = 0;

		try
		{
			String strBuffer = "";	

			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;

			// Read a line from the user
			strBuffer = burInput.readLine( );

			// Convert from string to integer
			floatValue = Float.parseFloat( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}


		// Return integer value
		return floatValue;
	}


}

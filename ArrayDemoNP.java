import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* @author  Nirupama Poojari
* @version 4.22
* @since   2021-12
 */
public class ArrayDemoNP {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		//#1 Declare Array
		//Allocate memory on stack 
        int aintValues[];
        int intAverage = 0;
        int intMaximum = 0;
        //#2 - Make Array
        aintValues = MakeArray();
        //#3 - Populate Array
        PopulateArray(aintValues);
        // #4 - Print Array
        PrintArray("Homework 4 printArray", aintValues);
       //#5 - Calculate Average
        intAverage = CalculateArrayAverage( aintValues );
        System.out.print("#5 - Array Average: " + intAverage + "\n"); 
       //#6 - Find maximum value 
        intMaximum = FindArrayMaximumValue(aintValues);
        System.out.print("#6 - Array Maximum: " + intMaximum + "\n");
       //#7 - Add Value to End
        aintValues = AddValueToEndOfArray ( aintValues, 5); 
        PrintArray( "#7 - Add Value to End(5): ", aintValues ); 
 
        //#8 - Add Values to Front 
        aintValues = AddValueToFrontOfArray (aintValues, 10);
        PrintArray("#8 - Add Value to Front(10): ", aintValues );
      //#9 - Insert Value Into Array
        aintValues = InsertValueIntoArray ( aintValues, 42, 2);
        PrintArray( "#9 - Insert Value Into Array(42, 2):", aintValues);
      //#10 Remove Value From Array
        aintValues = RemoveValueFromArray( aintValues, 2);
        PrintArray("#10 - Remove Value From Array (2): ", aintValues);
	}
	
	/**
	 * Method: MakeArray
	 * @param: none
	 * return: 
	 */
	public static int[] MakeArray() {
		int intArraySize = 0;
		int aintValues[];
		
		do {
			System.out.print("Enter array size (0-100) ");
			intArraySize = ReadIntegerFromUser();
		} while (intArraySize < 0 || intArraySize > 100);
		aintValues = new int [ intArraySize ];
		return aintValues;
	}
	
	
	/**
	 * Method: PopulateArray
	 * @param: aintValues
	 * */
	public static void PopulateArray(int aintValues[]) {
		int intIndex = 0;
		for (intIndex = 0; intIndex < aintValues.length; intIndex+=1) {
			System.out.print("Enter Value [" + (intIndex + 1) + "]:");
			aintValues[intIndex] = ReadIntegerFromUser();
		}
		System.out.print("\n");
		System.out.print("\n");
		
	}
	/**
	 * Method: ReadIntegerFrom User
	 * @param: none
	 * */
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
			intValue = (int) Float.parseFloat( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}


		// Return integer value
		return intValue;
	}
	/**
	 * Problem 6: 
	 * Method: PrintArray
	 * @param: none
	 */
	
	public static void PrintArray(String strCaption, int aintValues[] ) 
	{ 
		  int intIndex = 0;

		  System.out.print(strCaption + "------------------\n");

		  // Print values 
		  if ( aintValues.length > 0) 
		  { 
		    //Yes 
		    for(intIndex = 0; intIndex < aintValues.length; intIndex += 1) 
		    { 
		      System.out.print("Value[" + (intIndex + 1) + "]=" + aintValues[ intIndex] + "\n");
		    } 
		  } 
		  else 
		  { 
		    //No 
		    System.out.print("Empty array\n");
		  } 
		  System.out.print("\n");
		  System.out.print("\n");
	}	
	/**
	 * Problem 7
	 * Method: 
	 * @param: Average functions 
	 * */
	public static int CalculateArrayAverage( int aintValues[]) 
	{ 
	  int intAverage = 0;
	  int intTotal = 0; 
	  int intIndex = 0;
	  
	  //Anything to find? 
	  if ( aintValues.length > 0) 
	  { 
	     for ( intIndex = 0; intIndex < aintValues.length; intIndex += 1) 
	     { 

	          intTotal += aintValues[ intIndex ]; 
	     } 
	     
	     //Average 
	     intAverage = intTotal / aintValues.length;
	     }

	  return intAverage;
	} 
	public static int FindArrayMaximumValue( int aintValues[]) 
	{
	  int intMaximum = 0;
	  int intIndex = 0;

	  // Anything to find? 
	  if( aintValues.length> 0) 
	  { 
		   intMaximum = aintValues[0];
	
		   for( intIndex = 1; intIndex < aintValues.length; intIndex += 1) 
		   { 
	
			    if( intMaximum < aintValues[ intIndex] ) 
			    { 
			      // yes, save it 
			        intMaximum = aintValues [intIndex]; 
			    }  
		   } 
	  } 
	   return intMaximum; 
	}
	public static int[] AddValueToEndOfArray ( int aintOldValues[], int intValueToAdd) 
	{ 
	   int aintNewValues[];
	   aintNewValues = InsertValueIntoArray ( aintOldValues, intValueToAdd, aintOldValues.length );
	   int intNewSize = 0; 
	   int intIndex = 0; 
	   // Allocate space
	   intNewSize = aintOldValues.length + 1;
	   aintNewValues = new int[ intNewSize ]; 
	   // Copy old values 
	   for( intIndex = 0; intIndex < aintOldValues.length; intIndex += 1) 
	   { 
	          aintNewValues[intIndex] = aintOldValues [intIndex];
	   } 
	   // Add value to end 
	   aintNewValues[intIndex] = intValueToAdd;
	   return aintNewValues; 
	} 
	public static int[] InsertValueIntoArray ( int aintOldValues[], int intValuesToInsert, int intInsertIndex)  
		{
		int aintNewValues[];
		int intNewSize =0;
        int intIndex =0;		
		//Boundary checking 
		if ( intInsertIndex <    0) intInsertIndex = 0;
		if( intInsertIndex > aintOldValues.length) intInsertIndex = aintOldValues.length;
		
		//Allocate space 
		intNewSize = aintOldValues.length + 1;
		aintNewValues = new int[ intNewSize ];
		
		//Copy 1st half
		for ( intIndex = 0; intIndex < aintOldValues.length; intIndex+= 1)
		{
		//Index is + 1 for new to old 
		aintNewValues[ intIndex] = aintOldValues[ intIndex ];
		} 
	     // Insert
        aintNewValues[intInsertIndex] = intValuesToInsert;
 
        //Copy and half
        for( intIndex = intInsertIndex; intIndex < aintOldValues.length; intIndex += 1) 
        { 
          //Index is + 1 for new to old 
          aintNewValues[ intIndex + 1] = aintOldValues[ intIndex ];
        }

		return aintNewValues; 
	} 
	public static int[] AddValueToFrontOfArray(int aintOldValues[], int intValueToAdd)
	{
	   int aintNewValues[];

	   aintNewValues = InsertValueIntoArray( aintOldValues, intValueToAdd, 0);

	   int intNewSize = 0;
	   int intIndex = 0;

	   //Allocate Space
	   intNewSize = aintOldValues.length + 1;
	   aintNewValues = new int[intNewSize];

	   // Add value to front
	   aintNewValues[0] = intValueToAdd;

	   //Copy old values 
	  for( intIndex = 0; intIndex < aintOldValues.length; intIndex +=1) 
	  { 
	     aintNewValues[intIndex + 1] = aintOldValues[ intIndex]; 
	  } 
	  return aintNewValues;   
	}

	public static int[] RemoveValueFromArray( int aintOldValues[], int intRemoveIndex ) 
	{ 

	    int aintNewValues[] = new int [0];// Makes an empty array as opposed to no array.
	    int intNewSize = 0;
	    int intIndex = 0;
	  
	    //Anything to remove? 
	    if( aintOldValues.length > 0)
	    { 
	     // Yes
	     // Boundary checking
	     if( intRemoveIndex < 0) intRemoveIndex = 0;
	     if ( intRemoveIndex > aintOldValues.length - 1)intRemoveIndex = aintOldValues.length - 1;
	      
	     //Allocate space 
	     intNewSize = aintOldValues.length - 1; 
	     aintNewValues = new int[ intNewSize ];

	     // Copy 1st half
	     for( intIndex = 0; intIndex < intRemoveIndex; intIndex += 1) 
	     { 
	       //Index is 1 to 1 for new to old 
	       aintNewValues[ intIndex] = aintOldValues[ intIndex ];
	     } 
	     
	    //Copy second half
	    for( intIndex = intRemoveIndex + 1; intIndex < aintOldValues.length; intIndex += 1)
	    { 
	      //Index is -1 for new to old
	      aintNewValues[ intIndex -1] = aintOldValues[intIndex];
	    } 

	 } 
	  return aintNewValues;

	}
}


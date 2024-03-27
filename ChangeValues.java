/**
* Name: ChangeValues
* Abstract: This class ...
*/ 
public class ChangeValues
{

	/** 
	* main method
	* Abstract:
	*/
	public static void main( String astrCommandLine[ ] )
	{
		int aintValues[ ] = new int[ 3 ]; 
		aintValues[ 0 ] = 2;
		aintValues[ 1 ] = 4;
		aintValues[ 2 ] = 6;
		
		// Display value
		System.out.println( aintValues[ 0 ] 
		   + ", " + aintValues[ 1 ]
		   + ", " + aintValues[ 2 ] );// 1, 3, 5
		System.out.println( " This is the original before the call " );
		
		ChangeValues( aintValues );
	
		// Display value
		System.out.println( aintValues[ 0 ] 
		   + ", " + aintValues[ 1 ]
		   + ", " + aintValues[ 2 ] );// 1, 3, 5
		System.out.println( " This is the original after the call " );
	}


	/** 
	* Name: ChangeValues
	* Abstract: Change the data at the address
	*/
	public static void ChangeValues( int aintCopyOfAddressOfValuesArrayData[ ] )
	{
		// Manipulate data at address
		aintCopyOfAddressOfValuesArrayData[ 0 ] = 1;
		aintCopyOfAddressOfValuesArrayData[ 1 ] = 3;
		aintCopyOfAddressOfValuesArrayData[ 2 ] = 5;
		
		System.out.println( aintCopyOfAddressOfValuesArrayData[ 0 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 1 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 2 ]  );// 1, 3, 5
				System.out.println( " This is inside the call " );
	}

}

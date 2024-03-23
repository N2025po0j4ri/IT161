/**
* Name: ArrayChange
* Abstract: This class ...
*/ 
public class ArrayChange
{
	/**
	* main method
	* Abstract: This class ...
	*/ 
	public static void main( String astrCommandLine[ ] )
	{
		int aintValues[ ] = new int[ 3 ]; 
		aintValues[ 0 ] = 2;
		aintValues[ 1 ] = 4;
		aintValues[ 2 ] = 6;

		// Staring values
		System.out.println( aintValues[ 0 ] 
		   + ", " + aintValues[ 1 ]
		   + ", " + aintValues[ 2 ] 
		    + " >>> This is BEFORE the call to ChangeReference " );// 2, 4, 6
		
		ChangeReference( aintValues );

		// Display value
		System.out.println( aintValues[ 0 ] 
		   + ", " + aintValues[ 1 ]
		   + ", " + aintValues[ 2 ] 
		   + " >>> This is after the call" ); // 1, 4, 6
	}
	/**
	* Name: ChangeReference
	* Abstract: Change the data at the address
	*/
	public static void ChangeReference( int aintCopyOfAddressOfValuesArrayData[ ] )
	{
		aintCopyOfAddressOfValuesArrayData[ 0 ] = 1;
		System.out.println( aintCopyOfAddressOfValuesArrayData[ 0 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 1 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 2 ]  
				   + " >>> This is inside the call after a change to element 0 " );// 1, 4, 6
	
		// Original memory address overwritten in copy variable
		aintCopyOfAddressOfValuesArrayData = new int[ 3 ];
		System.out.println( aintCopyOfAddressOfValuesArrayData[ 0 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 1 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 2 ]  
				   + " >>> This is inside the call after copying the variable " );// 0, 0, 0
		
		// Manipulate data at address of NEW block or memory
		aintCopyOfAddressOfValuesArrayData[ 0 ] = 3;
		aintCopyOfAddressOfValuesArrayData[ 1 ] = 5;
		aintCopyOfAddressOfValuesArrayData[ 2 ] = 7;
		
		System.out.println( aintCopyOfAddressOfValuesArrayData[ 0 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 1 ] 
				   + ", " + aintCopyOfAddressOfValuesArrayData[ 2 ]   
				   + " >>> This is inside the call after using new area of memory " ); // 3, 5, 7
	}

}

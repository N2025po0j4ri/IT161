/**
* @author  Nirupama Poojari
* @version 4.22
* @since   2021-12
 */
public class CHomework6NP {

	/**
	 * Homework: Strings
	 */
	public static void main(String[] args) {
		//This is main method  
		int intVowelCount;

		System.out.println(" --Problem #1 - Count Vowels-- ");

		intVowelCount = CountVowelsInString( "Tomie Gartland " ); 
		System.out.println("Vowel Count = " + intVowelCount );
		
		System.out.println("\n --Problem #2 – Find Letter-- ");
		int intLetterIndex = FindLetterInString( "I Love Java ", 'J' );		// Should return 7: index of first J
		System.out.println( "Letter index = " + intLetterIndex );
		System.out.println("\n --Problem #3 – Count Letter-- ");
		int intLetterCount = CountLetterInString( "I Love Java", 'A' );		// Should return 2
		System.out.println( "Letter Count = " + intLetterCount );
		System.out.println("\n --Problem #4 – Left-- ");
		String strBuffer = Left( "I Love Java", 3 );		// Should return “I L”
		System.out.println( "Left(3) = " + strBuffer );
		System.out.println("\n --Problem #5 --Right ");
		strBuffer = Right( "I Love Java", 3 );					// Should return “ava”
		System.out.println( "Right(3) = " + strBuffer );
		// Problem #6 – VB SubString
		System.out.println("\n --Problem #6 --VB SubString ");
		strBuffer = VBSubString ( "I Love Java", 2, 4 );			// Should return “Love”
		System.out.println( "VB SubString = " + strBuffer );
		System.out.println("\n --Problem #7 --Java SubString ");
		// Problem #7 – Java SubString
		strBuffer = JavaSubString( "I Love Java", 2, 6 );			// Should return “Love”
		System.out.println( "Java SubString = " + strBuffer );
		System.out.println("\n --Problem #8 --Java Compare ");
		// Problem #8 – Java Compare
		String strSource = "I Love Java";
		//Compare String
		if(CompareStrings( strSource, new String( "I Love Java" ) ) == true ) 		// Should return true
		{
			System.out.println( "Same" );
		}
		else
		{
			System.out.println( "Different" );
		}
		System.out.println("\n --Problem #9 --CountWordsInString ");
		// Problem #9 – Count Words
		int intWordCount = CountWordsInString( "     I      Love Java     Class     " );	// Should return 4
		System.out.println( "Word Count = " + intWordCount );   
		
		
	}
	// CountWordsInString method 
	public static int CountWordsInString(String strSource) {
		int intWordCount = 0;
		for (int intIndex = 0; intIndex < strSource.length(); intIndex += 1) {
			if(!Character.isWhitespace(strSource.charAt(intIndex))) {
				intWordCount++;
				while(!Character.isWhitespace(strSource.charAt(intIndex))) {
					intIndex ++;
				}
			}
		}
		return intWordCount;
	}
	// CompareStrings method
	public static boolean CompareStrings(String strLeft, String strRight) {
		boolean ret = true;
		for (int intIndex = 0; intIndex < strLeft.length(); intIndex += 1) {
			if(strLeft.charAt(intIndex)!=strRight.charAt(intIndex)) {
				ret = false;
				break;
			}
			
		}
		
		return ret;
		
	}
	//JavaSubString method
	public static String JavaSubString(String strSource, int intStartIndex, int intStopIndex) {
		
		String strJavaSubstring = "";
		for (int intIndex = intStartIndex; intIndex < intStopIndex; intIndex += 1) { 
			strJavaSubstring = strJavaSubstring + strSource.charAt(intIndex);
		}
		return strJavaSubstring;
	}
	// VBSubString method 
	public static String VBSubString(String strSource, int intStartIndex, int intLength) {
		
		String strVBSubstring = "";
		for (int intIndex = intStartIndex; intIndex < intStartIndex + intLength; intIndex += 1) { 
			strVBSubstring = strVBSubstring + strSource.charAt(intIndex);
		}
		return strVBSubstring;
	}
	//Right method
    public static String Right(String strSource, int intLength) {
		
		String strRight = "";
		for (int intIndex = strSource.length() - intLength; intIndex < strSource.length(); intIndex += 1) { 
			strRight = strRight + strSource.charAt(intIndex);
		}
		return strRight;
	}
    //Left Method
	public static String Left(String strSource, int intLength) {
		
		String strLeft = "";
		for (int intIndex = 0; intIndex < intLength; intIndex += 1) { 
			strLeft = strLeft + strSource.charAt(intIndex);
		}
		return strLeft;
	}
	// CountLetterInString Method 
	public static int CountLetterInString(String strSource, char chrLetter) {
		//
		int intLetterCount = 0; //Counter of chrLetter in the string
		for (int intIndex = 0; intIndex < strSource.length(); intIndex += 1) { 
			if (Character.toUpperCase(strSource.charAt(intIndex)) == Character.toUpperCase(chrLetter) ){
				intLetterCount++;
			}
		}
		return intLetterCount;
	}
	// CountVowelsInString method 
	public static int CountVowelsInString(String strSource) {
		
		
		int intVowelCount = 0;
		char chrCurrentLetter = 0;
		int intIndex = 0; 

		for ( intIndex = 0; intIndex < strSource.length(); intIndex += 1) { 
			
			chrCurrentLetter = strSource.charAt( intIndex ); 
			chrCurrentLetter = Character.toUpperCase( chrCurrentLetter );

			switch ( chrCurrentLetter) { 
			case 'A': 
			case 'E': 
			case 'I':
			case 'O': 
			case 'U': intVowelCount+= 1; 
			           break; 
			} 

		}  
		// return the VowelCount;
		return intVowelCount;
	}
	// FindLetterInString Method
	    public static int FindLetterInString(String str , char chrLetter) {
			int intLetterIndex = 0;
	    	for(int i = 0; i < str.length(); i++) {
	    		if (str.charAt(i) == chrLetter) {
	    			intLetterIndex=i;
	    			break;
	    		}
	    	}
	    	
	    	return intLetterIndex;
	    	
	    	
	    }
}

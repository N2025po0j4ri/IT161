/**
 * @author Nirupama Poojari
 * @version 4.22
 * @since   2021-12
 */
public class CTrainedDog extends CDog {
	String m_strBreed = "";
	/**
	 * Method: CTrainedDog
	 * @param none
	 */
	public CTrainedDog() {
		
	}
	/**
	 * Method: PlayDead
	 * @param none
	 */
	   public void PlayDead() 
	   {
	     if( GetAge() < 5) 
	     { 
	       //Yes 
	       System.out.println("Bang! Oh, you got me.");
	     } 
	     else 
	     {
	       // No, can't teach an old dog new tricks 
	       System.out.println("Treat first. Trick second.");
	     } 
	  } 
		/**
		 * Method: FetchNewspaper()
		 * @param none
		 */
	   public void FetchNewspaper() 
	   {
		     // Young dog? 
		     if( GetAge() < 2) 
		     {  
		         //Yes
		         System.out.println("I'm too young.");
		     } 
	
		     else 
		     { 
		       // No
		       System.out.println("Here's your paper");
		     }
	   }
		/**
		 * Method: SetBreed
		 * @param strNewBreed String
		 */
	public void SetBreed (String strNewBreed)
	   { 
	     int intStopIndex = 0; 
	     
	     intStopIndex = strNewBreed.length();
	     // Too long? 
	     if ( intStopIndex > 10) 
	     { 
	    
	      // Yes, clip to 10 characters 
	      intStopIndex = 10; 
	     } 
	      
	     m_strBreed = strNewBreed.substring( 0, intStopIndex); 
	  }
	/**
	 * Method: GetBreed
	 * @param none
	 */
	   public String GetBreed() 
	   { 
	      return m_strBreed;
	   }
		/**
		 * Method: Print 
		 * @param none
		 */
	   public void Print() 
	   { 

	      System.out.println( "Name:  " + GetName( ));
	      System.out.println( "Age:   " + GetAge( ));
	      System.out.println( "Weight: " + GetWeight( ) );
	      System.out.println( "Breed: " + GetBreed( ));
	      
	      //Methods 
	      Bark( ); 
	      Fetch( ); 
	      PlayDead( );

	      System.out.println( "" ); 
	      System.out.println( "" );
	   } 
	/**
	 * Method: main
	 * @param args
	 */
	   
	public static void main(String[] args) {

	}

}

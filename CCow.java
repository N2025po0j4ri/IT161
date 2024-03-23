/**
 * 
 */

/**
 * @author ypooj
 *
 */
public class CCow extends CAnimal {

	private String m_strColor = "";

	/**
	 * 
	 */
	public CCow() {
		// TODO Auto-generated constructor stub
		
	}
	public void SetColor( String strNewColor) 
	{ 
	    int intStopIndex = 0;
	    
	  // Brown by defualt 

	   if ( strNewColor.equals("") == true) strNewColor = "Brown";

	  //Too long? 

	   intStopIndex = strNewColor.length();
	   if ( intStopIndex > 10) 
	   { 
	      //Yes, clip to 10 characters 
	      intStopIndex = 10; 

	   } 
	   
	   m_strColor = strNewColor.substring( 0, intStopIndex);

	 } 
   public String GetColor() 
   { 
       return m_strColor;
   }
   
   public void Graze() 
   { 
       System.out.println("Mmmm, this is some tasty grass.");
    
   }

	@Override
	public void MakeNoise() {
		// TODO Auto-generated method stub
		//super.MakeNoise();
		System.out.println("Mooo");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

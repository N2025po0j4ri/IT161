/**
 * @author Nirupama Poojari
 * @version 4.22
 * @since   2021-12
 */
public class CDragon extends CAnimal {

	/**
	 * Method: SetHeadCount
	 * @param m_intHeadCount int
	 */
	public void SetHeadCount(int m_intHeadCount) {
		this.m_intHeadCount = m_intHeadCount;
	}

	private int m_intHeadCount = 1;
	
	/**
	 * Method: CDragon
	 * @param none
	 */
	public CDragon() {
		
		
	}
	/**
	 * Method: BreathFire
	 * @param none
	 */
	public void BreathFire() {
	     int intIndex = 0;

	     // One head?
	     if( GetHeadCount() == 1) 
	     {
	        // Yes 
	        System.out.println("The dragon breathes fire.");
	     }
	     else 
	     {
	       // No, multi-headed 
	       System.out.println("The dragon breathes from each of its" + GetHeadCount() + "heads:");
	       for (intIndex = 0; intIndex < GetHeadCount(); intIndex += 1)
	       {
	           System.out.println("****Breath Fire****");
	       } 
	     }
	 }
	/**
	 * Method: GetHeadCount
	 * @param none
	 */
	private int GetHeadCount() {
		
		return m_intHeadCount;
	}

	/**
	 * Method: MakeNoise
	 * @param none
	 */
	public void MakeNoise() {
		//super.MakeNoise();
		System.out.println("Rawr");
	}

	/**
	 * Method: main
	 * @param args array
	 */
	public static void main(String[] args) {
		

	}

}

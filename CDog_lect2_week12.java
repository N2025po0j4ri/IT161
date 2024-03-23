/**
 * Class: CDog
 * this is a child class of CAnimal
 * @author Tomie Gartland
 *
 */
public class CDog extends CAnimal
{
		
	// ----------------------------------------------------------------------
	// ----------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------
	// ----------------------------------------------------------------------
	// Never make public properties.  
	// Make protected or private with public get/set methods
	
	private int m_intAge = 0;
	private float m_sngWeight = 0;	
	
	/**
	 * CDog - default constructor
	 */
	public CDog( )
	{
		Initialize( "", 0, 0 );
	}
	
	/**
	 * CDog 
	 * Constructor with parm
	 * @param strName
	 */
	public CDog( String strName )
	{
		Initialize( strName, 0, 0 );
	}
	

	/**
	 * CDog 
	 * Constructor with parm
	 * @param strName
	 * @param intAge
	 */
	public CDog( String strName, int intAge )
	{
		Initialize( strName, intAge, 0 );
	}

	/**
	 * CDog
	 * Constructor with parms
	 * @param strName
	 * @param intAge
	 * @param sngWeight
	 */
	public CDog( String strName, int intAge, float sngWeight )
	{
		Initialize( strName, intAge, sngWeight );
	}

	/**
	 * Initialize
	 * This will intialize all our values
	 * @param strName
	 * @param intAge
	 * @param sngWeight
	 */
	public void Initialize( String strName, int intAge, float sngWeight )
	{
		// protected: can be accessed only by the class in which it was declared
		//			or by classes that inherit.
		SetType( "Dog" );
		SetName( strName );
		SetAge( intAge );
		SetWeight( sngWeight );
	}

	/**
	 * SetAge - get age of animal
	 * @param intNewAge
	 */
	public void SetAge( int intNewAge )
	{
		// Negative?
		if( intNewAge < 0  )
		{
			// Yes, clip to 0
			intNewAge = 0;
		}
		
		m_intAge = intNewAge;
	}
	
	/**
	 * GetAge
	 * Get the age
	 * @return
	 */
	public int GetAge( )
	{
		return m_intAge;
	}
	
	/**
	 * SetWeight
	 * Set the weight
	 * @param sngNewWeight
	 */
	public void SetWeight( float sngNewWeight )
	{
		// Negative?
		if( sngNewWeight < 0 )
		{
			// Yes, clip it
			sngNewWeight = 0.0f;
		}
		
		m_sngWeight = sngNewWeight;
	}
	
	/**
	 * GetWeight
	 * Get the weight
	 * @return
	 */
	public float GetWeight( )
	{
		return m_sngWeight;
	}

	
	/**
	 * MakeNoise 
	 * Get noise of animal
	 */
	public void MakeNoise( )
	{
		Bark( );
	}
	

	/**
	 * Bark
	 * Get noise based on weight of animal
	 */
	public void Bark( )
	{
		// Big dog?
		if( GetWeight( ) < 15 )
		{
			// No, ankle biter
			System.out.println( "Yip, yip, yip" );
		}
		else
		{
			// Yes
			System.out.println( "Woof, woof" );
		}
	}

	/**
	 * Fetch 
	 * Fetch based on age of animal
	 */
	public void Fetch( )
	{
		// Old dog?
		if( GetAge( ) > 10 )
		{
			// Yes
			System.out.print( "Woah, woah, woah.\n" 
							+ "How about you fetch the stick this time.\n"
							+ "And some bacon.\n" );
		}
		else
		{
			// No
			System.out.println( "Fetching the tasty stick" );
		}
	}
	
	/**
	 * Method: Print
	 * Tell me about yourself
	 */
	public void Print( )
	{
		System.out.println( "Name:   " + GetName( ) );
		System.out.println( "Age:    " + GetAge( ) );
		System.out.println( "Weight: " + GetWeight( ) );
		
		// Methods
		Bark( );
		Fetch( );
		
		System.out.println( "" );
		System.out.println( "" );
	}
	
}

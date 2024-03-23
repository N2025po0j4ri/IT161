/**
 * Class: CAnimal
 * this is the parent class for the specific animals
 * @author Tomie Gartland
 */		
public class CAnimal
{
	// ----------------------------------------------------------------------
	// ----------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------
	// ----------------------------------------------------------------------
	private String m_strName = "";
	private String m_strType = "";
	
	/**
	 * SetName
	 * Set the name - maximum allowed characters for name is 10
	 * @param strNewName
	 */
	public void SetName( String strNewName )
	{
		int intStopIndex = 0;
		
		intStopIndex = strNewName.length( );
		
		// Too long?
		if( intStopIndex > 10 )
		{
			// Yes, clip to 10 characters
			intStopIndex = 10;
		}
		
		m_strName = strNewName.substring( 0,  intStopIndex );
	}
	
	/**
	 * GetName
	 * @return m_strName
	 */
	public String GetName( )
	{
		return m_strName;
	}	

	
	/**
	 * Method: SetType
	 * protected: In Java can be access only from class in which it was declared, by
	 * classes that inherit and anything else in the same package (package is
	 * the Java equivalent of a project in VB.Net)
	 * @param strNewType
	 */
	protected void SetType( String strNewType )
	{
		int intStopIndex = 0;
		
		intStopIndex = strNewType.length( );
		
		// Too long?
		if( intStopIndex > 50 )
		{
			// Yes, clip to 50 characters
			intStopIndex = 50;
		}
		
		m_strType = strNewType.substring( 0,  intStopIndex );
	}
	
	
	/**
	 * GetType
	 * Get the type
	 * @return
	 */
	public String GetType( )
	{
		return m_strType;
	}
	

	/**
	 * Method: MakeNoise
	 * 
	 */
	public void MakeNoise( )
	{
		System.out.println( "Undefined" );
	}
}

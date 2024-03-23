/**
 * CAnimal Parent class
 * @author Tomie Gartland
 *
 */
public class CAnimal
{
	// Properties
	// Never make public properties.  
	// Make protected or private with public get/set methods

	private String m_strName = "";
	private String m_strType = "";
	
	/**
	 * SetName
	 * @param strNewName
	 */
	public void SetName( String strNewName )
	{
		int intLength = 0;
		
		intLength = strNewName.length( );
		
		//Too Long?
		if ( intLength > 50 )
		{
			//if longer, clip to 5o characters
			intLength = 50;
		}
		m_strName = strNewName.substring ( 0, intLength );
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
	 * SetType
	 * @param strNewType
	 */
	public void SetType ( String strNewType )
	{
		//Negative?
		int intLength = 0;
		
		intLength = strNewType.length ( ) ;
		
		//Too Long?
		if ( intLength > 50 )
		{
			//if longer, clip to 5o characters
			intLength = 50;
		}
		m_strType = strNewType.substring ( 0, intLength );
	}
	/**
	 * GetType
	 * @return m_strType
	 */
	public String GetType( )
	{
		return m_strType;
	}
	/**
	 * MakeNoise 
	 * Define in child class
	 */
	public void MakeNoise ( )
	{
		System.out.println( "Undefined" );
	}
}
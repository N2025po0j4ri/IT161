/**
 * @author Nirupama Poojari
 * @version 4.22
 * @since   2021-12
 */
import java.sql.*;
public class CHomework13NP {

	private static Connection m_conAdministrator;
	/**
	 * Method: main
	 * @param args String
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Connection conAdministrator = null;
		boolean connected = OpenDatabaseConnectionMSAccessJRE8();
		//System.out.println("Database connection sucessful? " +connected);
		System.out.println("OpenDatabaseConnectionMSAccess : Connection Established - awesome work!"); 

		String strSelect =""; 
		Statement sqlCommand = null;
		ResultSet rsTEmployees = null; 

		strSelect = "SELECT *"
				+ " FROM TEmployees"
				+ " ORDER BY strFirstName";

		try {
			sqlCommand = m_conAdministrator.createStatement();
	

			ResultSet rstTTeams = sqlCommand.executeQuery( strSelect );
			

			//ResultSet rstTEmployees;
			//ResultSet rstTEmployees;
			while ( rstTTeams.next() == true) 
			{
				// Get column data for current row 
				String strFirstName = rstTTeams.getString( 5 );
				String primaryKey = rstTTeams.getString( 1 );
				//rstTTeams.
				// Print to console
			//	System.out.println("Table is: " + strTable + " strName: " + strFirstName);
			//	System.out.println("Table is: TEmployees Primary key: "+primaryKey+" strName: " + strFirstName);
				System.out.println("Table is: TEmployees Primary key: "+primaryKey+" strName: " + strFirstName);
			//	System.out.println(" strName: " + strFirstName);
			}
	
			// Clean Up
			rstTTeams.close( );
			sqlCommand.close( );

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CloseDatabaseConnectionMSAccessJRE8();
		//System.out.println("Database disconnection successful");
		System.out.println("LoadListFromDatabase : RecordSet Closed and Command Closed");
		System.out.println("main: Process Complete");
	}
	/**
	 * Method: OpenDatabaseConnectionMSAccessJRE8 boolean
	 * @param none
	 * jar files: 
	 * dbHCM.accdb
	 * dbHCM Build for Students.sql
	 * mssql-jdbc-7.2.1.jre11.jar
	 * mssql-jdbc-7.2.1.jre8.jar
	 * sqljdbc4.jar
	 * return: b1nResult
	 */
	public static boolean OpenDatabaseConnectionMSAccessJRE8()
	{
		boolean b1nResult = false;

		try{
			String strConnectionString = "";

			//Server name/port, IP address/port or path for file based DB like MS Access
			// System.getProperty("user.dir") => Current working directory from where
			// application was started 
			//	strConnectionString = "jdbc:ucanacess://" + System.getProperty("user.dir")
			//			    + "\\Database\\dbHCM.accdb";

			//strConnectionString = "jdbc:ucanacess://" + "C:\\Users\\ypooj\\OneDrive\\Documents\\Database3.accdb";

			strConnectionString = "jdbc:ucanaccess://C://Users//ypooj//OneDrive//Documents//dbHCM.accdb";
			//Open a connection to the database
			m_conAdministrator = DriverManager.getConnection( strConnectionString );
			// Success 
			b1nResult = true;

		} 
		catch ( Exception e) { 
			System.out.println( "Try again - error in OpenDB ");
			System.out.println( "Error is" + e );
		} 
		return b1nResult; 
	}
	/**
	 * Method: CloseDatabaseConnectionMSAccessJRE8
	 * @param none
	 */
	public static void CloseDatabaseConnectionMSAccessJRE8(){
		// Is there a connection object?
		if( m_conAdministrator != null )
		{
			// Yes, close the connection if not closed already
			try {
				if( m_conAdministrator.isClosed( ) == false ) 
				{
					m_conAdministrator.close( );
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



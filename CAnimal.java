/**
 * @author Nirupama Poojari
 * @version 4.22
 * @since   2021-12
 */
public class CAnimal {
	String m_strName;
	String m_strType; 
	/**
	 * Method: main
	 * @param args array
	 */
	public static void main(String[] args) {
		
	}
	/**
	 * Method: SetName
	 * @param strName String 
	 * */
    public void SetName(String strName) {
    	m_strName = strName;
    }
    /**
	 * Method: SetName
	 * @param none
	 * */
    public String GetName() {
    	return m_strName;
    } 
    /**
     * Method: SetType
     * @param: strType String
     * */
    public void SetType(String strType) {
    	m_strType = strType;
    } 
    /**
     * Method: GetType
     * @param: none
     * */
    public String GetType() {
    	return m_strType;
    }
    /**
     * Method: MakeNoise
     * @param: none
     * */
    public void MakeNoise() {
    	System.out.println("Undefined");
    }
}
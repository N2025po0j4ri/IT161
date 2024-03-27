import javax.swing.JOptionPane;
/**
 * Class:	HelloWorld
 * Abstract:Show a Message Box
 * 			We are using the javax.swing package for the JOptionPane class.
 * 			This is a pre-defined class in the Java system that can be reused.
 * 			If you replaced the JOptionPane with javax.swing.JOptionPane, you
 * 			will not need the import statement.	
 * 			Test out updates.
 * @author  TLG
 */
public class HelloWorld {

	/**
	 * main method for displaying message boxes
	 * @param args input for the program
	 */
	public static void main(String[] args) {
		// Display a window to say Hello!
		JOptionPane.showMessageDialog(null,  "Welcome to this class!");
		JOptionPane.showMessageDialog(null, "Hello!", "My Message", JOptionPane.INFORMATION_MESSAGE);
		javax.swing.JOptionPane.showMessageDialog(null, "This is a warning!", "Warning Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is an error!", "Error Title", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is informational!", "Info Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a question?", "What? Title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a plain message", "Plain Message Title", JOptionPane.PLAIN_MESSAGE);
	}
}
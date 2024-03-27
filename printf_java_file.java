import java.text.NumberFormat;
import java.util.Locale;

public class NumberAlignmentPrintf {
	public static void main(String args[]) {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("------------------------------------------------------------");
		System.out.printf("Your bonus is-------------------------> %20s %n", currencyFormat.format(25000.00));
		System.out.printf("But you owe commission of-------------> %20s %n", currencyFormat.format(100.25));
		System.out.printf("Notice different format here----------> $%,13.2f \n", 25.25);
		System.out.printf("Notice different format here again----> $%,13.2f \n", 1025.00);
		System.out.printf("Notice different format here again3---> $%,13.2f \n", 111025.00);
	}
}
//output is this:
//Your bonus is------------------------->           $25,000.00 
//But you owe commission of------------->              $100.25 
//Notice different format here----------> $        25.00 
//Notice different format here again----> $     1,025.00 
//Notice different format here again3---> $   111,025.00 
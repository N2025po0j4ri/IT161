/**
 * @author Nirupama Poojari
 * @version 4.22
 * @since   2021-12
 *
 */
/**
 * Method: HWConstructors class
 * @param: none
 * */
public class HWConstructors {

	/**
	 * Method: HWConstructors
	 * @param: none
	 */
	public HWConstructors() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Method: main Static Void 
	 * @param: astrCommandLine String
	 * Overload: Step1ConstructorsAndOverloading(), Step2InheritanceAndSuper();
	 * */
	public static void main ( String astrCommandLine[]) 
	{ 

		Step1ConstructorsAndOverloading();

		Step2InheritanceAndSuper();
	} 
	/**
	 * Method: Step1ConstructorsAndOverloading static void  
	 * @param: none
	 * */
	public static void Step1ConstructorsAndOverloading() 
	{

		System.out.println("Step 1 - Constructors and overloading");
		System.out.println("-------------------------------------");

		CDog clsBuster1 = new CDog(); 
		CDog clsBuster2 = new CDog( "Buster2");
		CDog clsBuster3 = new CDog( "Buster3", 11);
		CDog clsBuster4 = new CDog( "Buster4", 11, 40);

		clsBuster1.Print();
		clsBuster2.Print();
		clsBuster3.Print();
		clsBuster4.Print();
	}
	/**
	 * Method: Step2InheritanceAndSuper static void  
	 * @param: none
	 * */
	public static void Step2InheritanceAndSuper() 
	{ 

		System.out.println("Step 2 - Inheritance and super");
		System.out.println("---------------------------------");
		
		//Declares new objects 5 times from the following code
		CDog clsSuperBuster1 = new CTrainedDog();
		CDog clsSuperBuster2 = new CTrainedDog("2SuperBuster");
		CDog clsSuperBuster3 = new CTrainedDog("3SuperBuster", 11);
		CDog clsSuperBuster4 = new CTrainedDog("4SuperBuster", 11, 40);
		CDog clsSuperBuster5 = new CTrainedDog("5SuperBuster", 11, 40, "Basset Hound");

		//Multiple print statements 
		clsSuperBuster1.Print();
		clsSuperBuster2.Print();
		clsSuperBuster3.Print();
		clsSuperBuster4.Print();
		clsSuperBuster5.Print();
	}
}

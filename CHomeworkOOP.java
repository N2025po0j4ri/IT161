/**
 * @author Nirupama Poojari
 * @version 4.22
 * @since   2021-12
 */
public class CHomeworkOOP {

	/**
	 * Method: CHomeworkOOP()
	 */
	public CHomeworkOOP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method: main
	 * @param args array
	 */
	public static void main(String[] args) {
	
		ShowPolymorphism ();
	}
	
	/**
	 * Method: ShowPolymorphism 
	 * @param none
	 * */
	public static void ShowPolymorphism () {
		// declare variables
		int intIndex = 0;
		//Populate using explicit cast
		CAnimal aclsZoo[ ] = new CAnimal [ 9 ];

		// Allocate space
		CDog clsBuster = new CDog( );
		clsBuster.SetName( "Buster" );
		clsBuster.SetType ( "Dog" );
		clsBuster.SetAge(11);
		clsBuster.SetWeight(40);
		aclsZoo [ 0 ] = (CAnimal) clsBuster;

		CCat clsSunny = new CCat( );
		clsSunny.SetName ( "Sunny" );
		clsSunny.SetType ( "Cat" );	
		aclsZoo [ 1 ] = (CAnimal) clsSunny;

		CDuck clsDaffy = new CDuck( );
		clsDaffy.SetName ( "Daffy" );
		clsDaffy.SetType ( "Duck" );					
		aclsZoo [ 2 ] = (CAnimal) clsDaffy;
		
		aclsZoo [ 3] = null;

		CCow clsBesse = new CCow();
		clsBesse.SetName("Bessie");
		clsBesse.SetType("Cow");
		clsBesse.SetColor("");
		aclsZoo[4] = (CAnimal)clsBesse;

		CDragon clsSmaug = new CDragon();
		clsSmaug.SetName("Smaug");
		clsSmaug.SetType("Dragon");
		clsSmaug.SetHeadCount(3);
		aclsZoo[5] = (CAnimal)clsSmaug;

		CTrainedDog clsFifi = new CTrainedDog();
		clsFifi.SetName("Fifi");
		clsFifi.SetType("Trained Dog");
		clsFifi.SetAge(2);
		clsFifi.SetWeight(10);
		clsFifi.SetBreed("Poodle");
		aclsZoo[6] = (CAnimal)clsFifi;
		System.out.println("Polymorphism - Let's go to the zoo!");
		System.out.println( "----------------------------------------------------"); 
		for ( intIndex = 0; intIndex < aclsZoo.length; intIndex += 1 )
		{
			if ( aclsZoo [ intIndex ] != null )
			{
				//This is polymorphism. All subclasses that derive from CAnimal have
				System.out.println("Animal in cage #" + (intIndex + 1));
				System.out.println( "Name:" + aclsZoo [ intIndex ].GetName( ) );
				System.out.println( "Type:" + aclsZoo [ intIndex ].GetType( ) );
				aclsZoo [ intIndex ].MakeNoise( );
				//System.out.println( "" );


				String strAnimalType = aclsZoo[intIndex].GetType();

				//If this is type Dog, call the Fetch method

				if( strAnimalType.equals("Dog") == true) 
				{ 

					//Order we want:
					//1) Get array element
					//2) explicit cast 
					//3) call child-specific method  
					((CDog) aclsZoo [intIndex]).Fetch();
				} 
				// If this is type Trained Dog, call PlayDead method and Print method
				else if ( strAnimalType.equals("Trained Dog")== true)
				{ 
					((CTrainedDog)aclsZoo[intIndex]).PlayDead();
					((CTrainedDog)aclsZoo[intIndex]).Print();
					((CTrainedDog)aclsZoo[intIndex]).FetchNewspaper();
				} 
				// If this is a Cow, call Graze method and print the color
				else if( strAnimalType.equals("Cow") == true){
					((CCow)aclsZoo[intIndex]).Graze();
					System.out.println("Color is " + ((CCow)aclsZoo[intIndex]).GetColor());
			    }
				// if this is a Dragon, call BreathFire method
				else if( strAnimalType.equals("Dragon") == true) 
				{
					((CDragon)aclsZoo[intIndex]).BreathFire(); 
				}
				System.out.println("");

			}
		}
	}
} 



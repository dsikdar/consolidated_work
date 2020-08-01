import java.util.Scanner;


public class UserInterface {

	public static void main(String[] args) throws ConfigurationMisMatchException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the RAM capacity (in GB)");
		int rCapacity=sc.nextInt();
		System.out.println("Enter the HD capacity available (in GB)");
		int hdCapacity = sc.nextInt();
		System.out.println("Enter the Net Connection speed (in KBPS)");
		int speed = sc.nextInt();
		
 		//fill in the code
		
		if(Validator.validateConfiguration(rCapacity, hdCapacity, speed))
		{
			System.out.println("Thank you for installing the game");
		}
		else {
			System.out.println("Sorry cannot install the game");
		}
		

	}

}

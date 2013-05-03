import java.util.*;

public class PetObject {

		
		
		public static void main(String[] args)
		{	//Variables to hold user input
			
			Pet myPet = new Pet();
			
			
			//Scanner object for keyboard input
			Scanner scan = new Scanner(System.in);
			
				System.out.println("Please enter pet's name.");
				myPet.setName(scan.nextLine());
				
				System.out.println("Please enter the pet's type.");
				myPet.setType(scan.nextLine());
				
				System.out.println("Please enter the pet's age.");
				myPet.setAge(scan.nextInt());
				
				System.out.println("The pet's name is " + myPet.getName());
				System.out.println("The pet's type is " + myPet.getType());
				System.out.println("The pet's age is " + myPet.getAge());

	}

}

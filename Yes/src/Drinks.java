import java.util.*;
public class Drinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String color; 
		String drink;
		
		System.out.println("Enter your favoreite color.");
		color = scan.next();
		
		System.out.println(color);
		
		System.out.println("MARK!!! MARK!! DO YOU LIKE DRINK!?");
		drink = scan.next();
		
		if(drink.equals("yes"))
		System.out.println("cool man");
		else
		System.out.println("aw man");
		
		
		
	}

}

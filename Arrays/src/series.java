import java.util.*;

public class series {

	// Prompt user for 3 numbers
	// display those numbers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final int SIZE = 3;
		int[] numbers = new int[SIZE];
		
		System.out.println("Enter a number");
			numbers[0] = scan.nextInt();
		System.out.println("enter a number");
			numbers[1] = scan.nextInt();
		System.out.println("enter last number");
			numbers[2] = scan.nextInt();
			
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		}
	}
	


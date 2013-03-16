import java.util.*;
public class Factorial {

	
	public static void main(String[] args) {
		
		
		int number;
		int total;
		total=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a non negative integer");
		number = scan.nextInt();
		total = number * number;
		System.out.println(total);
		
	}

}

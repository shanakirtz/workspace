import java.util.*;
public class Factorial {

	
	public static void main(String[] args) {
		
	;
		int number;
		int total;
		total=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a non negative integer");
		number = scan.nextInt();
		
		for(int i =1; i <=number; i++)
		total = total * i;
		
		System.out.println(total);
		
	}

}

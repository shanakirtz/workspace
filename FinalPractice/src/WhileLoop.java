import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		
	int num;
	int product = 0;
	final int MAX_VALUE = 100;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("This program multiplies your number by 10");
	System.out.println("Enter a number");
	num = scan.nextInt();
	
	while(num < MAX_VALUE)
	{
	product = num * 10;
	System.out.println(product);
	System.out.println("enter another value");
	num = scan.nextInt();
	}
	System.out.println("That value is too high");
	}
}

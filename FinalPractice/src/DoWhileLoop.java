import java.util.Scanner;
public class DoWhileLoop {


	public static void main(String[] args) {
		
		int num, num1, num2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Please enter a number");
			num1 = scan.nextInt();
			System.out.println("Please enter a number");
			num2 = scan.nextInt();
			sum = num1 + num2;
			System.out.println(sum);
			System.out.println("Do you wish to do this again press 99 to quit?");
			num = scan.nextInt();
			
		}
			while(num != 99);
			System.out.println("See you later");
				
			
				
			

	}

}

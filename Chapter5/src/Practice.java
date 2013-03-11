import java.util.Scanner;

public class Practice {

		public static Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int product = 0;
	while(product < 100) {
		System.out.println("Please enter a number");
		
		int x = scan.nextInt();
		product = x * 10;
	}
		
		
	}

}

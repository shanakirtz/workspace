import java.util.Scanner;


public class Ch6 {
	
	public static void main(String[] args) {
		System.out.println("Enter in two numbest to find the greater of the 2: ");
		System.out.println(max(s.nextInt(), s.nextInt()));
		
		for(int i = 1 ; i <= 10 ; i++)
			fallingDistance(i);
	}
	
	private static int max(int x , int y) {
		if(x>y)
			return x;
		else
			return y;
	}
	
	private static void fallingDistance(int time) {
		System.out.println((.5*(9.8*(time^2))));
	}
	
	private static Scanner s = new Scanner(System.in);

}

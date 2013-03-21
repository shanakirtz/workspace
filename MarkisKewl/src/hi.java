import java.util.*;
public class hi {

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi Mark. On a scale of 1-10 how was your day?");
		number = scan.nextInt();
		
		if(number >= 5)
			System.out.println(":)");
		else
			System.out.println(":(");
		
	}

}

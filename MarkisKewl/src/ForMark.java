import java.util.*;
public class ForMark {

//This is for my bff
	
	public static void main(String[] args) {
		int number;
		String word;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("MARK, on a scale of 1-10, how cool is Shana?");
		number = scan.nextInt();
		
		if(number > 5)
			System.out.println("cool man");
		else 
			System.out.println("Not cool man");
		
		
		System.out.println("Use one word to describe Shana");
		word = scan.next();
		
		System.out.println("On a scale of 1-20, how much do you like punk rock?");
		number = scan.nextInt();
		
		if(number > 10)
			System.out.println("Yay Punx");
		else
			System.out.println("Go listen to Social Distortion");
		
				

	}

}

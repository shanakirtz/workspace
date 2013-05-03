import java.util.Scanner;
public class WhileLoopEx {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int age;
		final int MAX_AGE = 35;
		
		System.out.println("Please enter age");
		age = scan.nextInt();
		
		while(age < MAX_AGE)
		{
		System.out.println("You are still young");
		System.out.println("Enter friend's age");
		age = scan.nextInt();
		
		}
		
		System.out.println("Getting old tiger");
	}

}

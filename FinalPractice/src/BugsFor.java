import java.util.*;
public class BugsFor {


	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int bugs;
		System.out.println("Please enter number of days you will collect bugs");
		int days = scan.nextInt();
		
		for(int i = 0; i < days; i++)
		{
			System.out.println("How many bugs did you collect today?");
			bugs = scan.nextInt();
			total = total + bugs;
			
		}
		System.out.println("You collected " + total + " bugs.");
	
	}

}

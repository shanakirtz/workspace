import java.util.*;
public class NestedLOOPS {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int rain;
		int year;
		int month = 0;
		int total = 0;
		int average = 0;
		
		
			
		
		System.out.println("How many months are you collecting rain for?");
		month = scan.nextInt();
		
		
			for(int i = 0; i < 3; i++){
				System.out.println("How much rainfall for this month?");
				rain = scan.nextInt();
				total = total + rain;
				average = total / month;
			}
			
			System.out.println("The number of months is " +  month);
			System.out.println("The total rainfall for the year is " + total);
			System.out.println("The average rainfall per month is " + average);
		}
	}
	
		


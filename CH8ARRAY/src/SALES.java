import java.util.*;
public class SALES {


	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter today's sales");
		int [] daysales = new int [7];
		int totalSales = 0;
		
		for(int index = 0; index < daysales.length; index++){
		
			System.out.print("Enter the sales for today" );
			daysales[index] = scan.nextInt();
			totalSales = totalSales + daysales[index];
		}
		System.out.print("Your weekly total sales was: " + totalSales);
				
	}

}

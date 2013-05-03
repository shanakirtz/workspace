import java.util.*;

public class tempertures {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int SIZE = 3;
		int[] hours = new int[SIZE];
		int index;
		
		for(index = 0; index<= SIZE -1; index++)
		{
			System.out.print("Enter the hours worked by " + "employee number" +(index +1) + ": ");
			hours[index] = scan.nextInt();
		}
				for(index=0; index <= SIZE -1; index++)
					System.out.println("employee number " + (index + 1) + " Worked " + hours[index]);
					
		
	}

}

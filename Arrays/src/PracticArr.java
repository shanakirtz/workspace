import java.util.*;
public class PracticArr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int SIZE =3;
		int[] hours = new int[SIZE];
		int i;
		for( i = 0; i < SIZE - 1; i++){
		
			System.out.println("Enter the hours worked by " + "employee number " + (i + 1) + ": ");
			hours[i] = scan.nextInt();
		}
		
		for(i =0; i <= SIZE -1; i++)
			System.out.println("The hours for employee " + (i+1) + hours[i]);
	}

}

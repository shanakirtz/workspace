import java.util.*;
public class NumAnalysis {

	public static void main(String[] args) {
		int total =0;
		
		int [] arr = new int [5];
		Scanner scan = new Scanner(System.in);
		
		
		for(int i =0; i < arr.length; i++){
		
			System.out.println("Please enter a number");
			arr[i] = scan.nextInt();	
			total = total + arr[i];
			
		}
		int average = total/arr.length;
		System.out.println("The average of the numbers is " + average);
		System.out.println("The total of the numbers is " + total);
		
		Arrays.sort(arr);
		System.out.println("The lowest number is " + arr[0]);
		System.out.println("The highest number is " + arr[arr.length-1]);
	}

}

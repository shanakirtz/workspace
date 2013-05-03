import java.util.*;
public class ArrNumbers {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];
		int totalNum = 0;
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Please enter a number");
			array[i] = scan.nextInt();
			totalNum = totalNum + array[i];
		}
		
		System.out.println("The total of numbers is " + totalNum + " ");
		System.out.println("The highest of numbers is " + high(array));
		System.out.println("The lowest number is " + low(array));
		System.out.println("The average is " + average(array));
	}
	
		
		public static double average(int [] array) {
			double sum=0;
			double average=0;
			
			for( int i = 0; i < array.length; i++){
				sum += array[i];
				average = sum/array.length;
			}
				return average;
			}
		
		
		public static int high(int [] array){
			int high = 0;
			
			for(int h = 0; h < array.length; h++){
				if(array[h] > high)
					high = array[h];
			
		}
			return high;
		
	}
		public static int low(int [] array){
			int low = 1;
			for(int l = 0; l < array.length; l++){
				if(array[l] < low)
					low = array[l];
			}
			return low;
			
		}

}

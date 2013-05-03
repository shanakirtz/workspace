import java.util.*;
public class rainfall {

	public static void main(String[] args) {
		
		int [] rainfall = new int [12];
		Scanner scan = new Scanner(System.in);
		int totalRain = 0;
		int sum = 0;
		
		for(int i = 0; i < rainfall.length; i++){
			System.out.println(" Enter rainfall for month");
			rainfall[i] = scan.nextInt();
			totalRain = totalRain + rainfall[i] ;
		}
		System.out.print("The rainfall for the year is :" + totalRain + " ");
		System.out.println("The average monthly rainfall is " + average (rainfall));
		System.out.println("The highest of the array is " + high (rainfall));
		System.out.println("The lowest of the array is " + low (rainfall));
	}
	public static double average (int [] rainfall) {
		
		int sum = 0;
	       double average = 0;
	       
	       for(int i =0; i <rainfall.length; i++)
	         sum += rainfall[i];
	      average = sum/rainfall.length;  
	      return average;
	}
	
	public static int high (int[] rainfall) {
		
		int high = 0;
		   
	    for(int d = 0; d <rainfall.length; d++)
	    {
	      if(rainfall[d] > high)
	       high = rainfall[d];	      		
	}
	{		
	}
	return high;
	}
	public static int low (int[] rainfall) {
		
		int low = 1;
		   
	    for(int l = 0; l <rainfall.length; l++)
	    {
	      if(rainfall[l] < low)
	      low = rainfall[l];	      
		
	}
	{		
	}
	return low;
}
}
import java.util.*;
public class NestedLoopAgain {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int total = 0;
		for(int i =0; i <5; i++){
			System.out.println("Please enter a number 1 - 9.");
			num = scan.nextInt();
				if(num < 9)
				total = total + num ;
					while(num > 9){
						System.out.println("Error! Enter a new number");
						num = scan.nextInt();
							
						
				}		
		}
		System.out.println("The total of numbers entered is " + total);
	}

}

import java.util.*;
public class ForLoopTwo {


	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		while( num >= 0){
		System.out.println("Please enter positive numbers or -99 to end");
		num = scan.nextInt();
		if(num >= 0)
		total = total + num;
		}
		System.out.println(total);
	}

}

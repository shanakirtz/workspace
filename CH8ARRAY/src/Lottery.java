import java.util.*;

public class Lottery {


	public static void main(String[] args) {
		int [] lottery = new int [7];
		
		Random rand = new Random();
		for (int i = 0; i < lottery.length; i++) {
			lottery[i] = rand.nextInt(10);
			
			System.out.print(lottery[i] + " ");
		}
		
	}
}
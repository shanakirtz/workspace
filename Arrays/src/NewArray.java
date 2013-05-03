import java.util.*;
public class NewArray {

	public static void main(String[] args) {
		
		int[] scores = { 87,75,98,100,82};
		boolean found;
		int index;
		found = false;
		index = 0;
		
		while (found == false && index < scores.length){
			if(scores[index] == 100)
				found = true;
			else
				index = index + 1;
		}
		
		if(found)
			System.out.println("You earned 100 on test number " + (index +1));
		else
			System.out.println("You did not earn 100 on any test.");

	}

}

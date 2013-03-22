import java.util.*;

public class Options {

	
	public static void RollDice(){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int fate;
		//fate = rand.nextInt(3);
		
		System.out.println("Enter 1 to roll dice");
		scan.nextInt();
		fate = rand.nextInt(2);
		//System.out.println(fate);
		
		
		if(fate == 0){
			System.out.println("Now is the time. You must fight the dragon");
		}
				if(fate == 1){
					System.out.println("Evil elves! You must stop them");
				}
						if(fate == 2){
							System.out.println("A wizard appears. He gives you magic potion");
						}
				}
			
		
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int number;
		int next;
		
		number = rand.nextInt(2);
		
		System.out.println(number);
		
			
		if(number == 0){
			System.out.println("Your journey begins in the forest");
			System.out.println("enter 1 to take the trail");
			System.out.println("enter 2 to travel amongst the shadows");
				next = scan.nextInt();
				if(next == 1)
					System.out.println("You entered one. Play it safe and follow the trail..");
				else{
					if(next ==2)
						System.out.println("You entered 2");
						System.out.println("Very brave. You see some strange mushrooms...");
				}
				RollDice();
			
		}
	
		if(number == 1){
			System.out.println("Your journey begins in a dungeon");
			System.out.println("enter 1 to beg the guard to let you out");
			System.out.println("enter 2 to try to pick the lock with pin");
			next = scan.nextInt();
			if(next == 1)
				System.out.println("You entered one. The guard refused...");
			else
			{
				if(next ==2)
					System.out.println("You entered 2. You pick the lock while the guard was asleep.");
			}
			RollDice();
		}
		if(number == 2){
			System.out.println("Your journey begins in a castle");
			System.out.println("enter 1 to go to the spell room");
			System.out.println("enter 2 to leave the castle grounds without permission");
			next = scan.nextInt();
			if(next == 1)
				System.out.println("You entered one. The witch picks a spell");
			else{
				if(next ==2)
					System.out.println("You entered 2. Very brave.");
					System.out.println("You must battle the dragon to enter the city");
			}
			RollDice();
		}
		
		
		}
		
}

		
	
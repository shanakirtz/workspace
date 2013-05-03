import java.util.*;
public class Passing {




	public static void main(String[] args) {
		
		  
		    
		    System.out.println("Your name is " + getName());
			System.out.println("Your lucky number is " + getNum());
			System.out.println("The answer is " + multNum());
			
		    
	}
		
		public static String getName(){
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		return name;
		}
		
		public static int getNum(){
			Random rand = new Random();
			int num;
			
			num = rand.nextInt(100);
			return num;
		}
		
		public static int multNum(){
			
			Scanner scan = new Scanner(System.in);
			int first;
			int second;
			
			
			System.out.println("Enter a integer");
			first = scan.nextInt();
			System.out.println("Enter a integer");
			second = scan.nextInt();
			
			int total = first * second;
			return total;
		}

	}



import java.util.*;
public class Arr {

	
	public static void main(String[] args) {
		
		String[] arr = new String[4];
		String name = getName(arr);
		String car = getCar(arr);
		String house = getHome(arr);
		
		System.out.println("You will marry " + name);
		System.out.println("You will drive a " + car);
		System.out.println("You will live in a " + house);
	}
	
	private static String getCar(String[] arr) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		String car = null;
		
		for(int x = 0; x < arr.length; x++){
			System.out.println("Please enter vehicle number " + (x +1) + ":");
			arr[x]= s.nextLine();
			car = arr[rand.nextInt(arr.length)];
			
		}
		return car;
	}
	
		public static String getName(String [] arr){
			
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int i;
		String name;
		
		System.out.println("This is a fortune telling game");
		
		for( i = 0; i < arr.length; i ++){
			System.out.println("Please enter name number " + (i + 1) + " : " );
			arr[i] = scan.nextLine();	
			
		}
			name = arr[rand.nextInt(arr.length)];
			return name;
			
		}
			//prints out names entered
			//for( i = 0;  i < arr.length; i++){ 
			//System.out.print9ln("The names you entered are " + (arr[i]));
		//}
		public static String getHome(String[] arr){
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();
			int i;
			String home;
			
			for(i = 0; i < arr.length; i++){
			System.out.println("Please enter a type of home " + (i +1) + ":");
			arr[i] = scan.nextLine();
			}
			home = arr[rand.nextInt(arr.length)];
			return home;
		}
	
}

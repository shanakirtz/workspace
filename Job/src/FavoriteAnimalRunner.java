import java.util.*;
public class FavoriteAnimalRunner {

	
	public static void main(String[] args) {
		
	FavoriteAnimal  myAnimal;
	myAnimal = new FavoriteAnimal("dog", "blue", 9);
	
	System.out.println("The animal is " + myAnimal.getAnimal());
	System.out.println("The color is " + myAnimal.getColor());
	System.out.println("The number is " + myAnimal.getAge());
		
	}

}

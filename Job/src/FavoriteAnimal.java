
public class FavoriteAnimal {

	private String animal;
	private String color;
	private int age;

public FavoriteAnimal(String ani, String col, int a){
	animal = ani;
	color = col;
	age = a;
}
	//Mutator Methods
	public void setAnimal(String ani){
		animal = ani;
	}
	
	public void setColor(String col){
		color = col;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	//Accessor methods
	public String getAnimal(){
		return animal;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getAge(){
		return age;
	}

}

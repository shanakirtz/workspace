//Class listing 14.4
public class ConstructorDemo {


	public static void main(String[] args) {
	
		//Declare a variable that can reference a CellPhone Object
		CellPhones myPhone;
		
		myPhone = new CellPhones("Motorola", "M1000", 199.99);
		
		System.out.println("The manufacturer is " + myPhone.getManufacturer());
		System.out.println("The model number is " + myPhone.getModelNumber());
		System.out.println("The retailPrice is " + myPhone.getRetailPrice());
	}

}

// Class listing 14.4
public class CellPhones {

		//Field Declarations
	private String manufacturer;
	private String modelNumber;
	private double retailPrice;
	
		//Constructor
	public CellPhones(String manufact, String modNum, double retail){
		manufacturer = manufact;
		modelNumber = modNum;
		retailPrice = retail;
	}
		//mutator methods
	public void setManufacturer(String manufact){
		manufacturer = manufact;
	}
	
	public void setModelNumber(String modNum){
		modelNumber = modNum;
	}
	
	public void setRetailPrice(double retail){
		retailPrice = retail;
	}
	
	//Accessor methods
	public String getManufacturer(){
		return manufacturer;
	}

	public String getModelNumber(){
		return modelNumber;
	}
	
	public double getRetailPrice(){
		return getRetailPrice();
	}
}

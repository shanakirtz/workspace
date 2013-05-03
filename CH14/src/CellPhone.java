import java.util.*;

public class CellPhone {
	//field declarations
	private String manufacturer;
	private String modelNumber;
	private double retailPrice;
	
	//method definitions
	public void setmanufacturer(String manufact){
		manufacturer = manufact;
	}
	
	public void setModelNumber(String modNum){
		modelNumber = modNum;
	}
	
	public void setRetailPrice(double retail){
		retailPrice = retail;
	}
	
	public String getManufacturer(){
		return manufacturer;
		
	}
	public String getModelNumber(){
		return modelNumber;
	}
	public double getRetailPrice(){
		return retailPrice;
		
	}
	}



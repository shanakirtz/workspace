import java.util.*;

public class Vehicles {
	private String vehicle;
	private String model;
	private int speed;
	
	public void setVehicle(String v)
	{
		vehicle = v;
	}

	public void setModel(String m)
	{
		model = m;
	}

	public void setSpeed(int s)
	{
		speed = s;
	}
	
	//Accessor methods getters
	
	public String getVehicle()
	{
		return vehicle;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getSpeed()
	{
		return speed;
	}
}

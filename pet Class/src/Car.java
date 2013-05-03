//Shana Kirtz
// Programming Exercise 2

import java.util.*;
public class Car {

	//Field Declarations
	private int yearModel;
	private String make;
	private int speed;

	//Constructor
	public Car(int yearModel, String make)
	{
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	//Mutator Methods
	public void setYearModel(int yearModel)
	{
		this.yearModel = yearModel;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	//Accessor Methods
	public int getYearModel()
	{
		return yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public void Accelerate()
	{
		this.speed = this.speed + 5;
	}
	
	public void Brake()
	{
		this.speed = this.speed - 5;
	}
	


	
}
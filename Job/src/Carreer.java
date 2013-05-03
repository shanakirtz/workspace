import java.util.*;
public class Carreer {

	private String job;
	private int years;
	private double salary;
	
	//Method Definitions
	public void setJob(String j)
	{
		job = j;
	}

	public void setYears(int y)
	{
		years = y;
	}
	
	public void setSalary(double s)
	{
		salary = s;
	}

	public String getJob()
	{
		return job;
	}
	
	public int getYears()
	{
		return years;
	}
	
	public double getSalary()
	{
		return salary;
	}
}

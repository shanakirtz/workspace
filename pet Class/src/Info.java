
public class Info {

	private String name;
	private String address;
	private int age;
	private int phone;
	
	public Info(String name, String address, int age, int phone)
	{
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String Address)
	{
		this.address = address;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getPhone()
	{
		return phone;
	}
}

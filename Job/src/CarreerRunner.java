import java.util.*;
public class CarreerRunner {
	
	public static void main(String [] args){
		

	Carreer myCarreer;
	myCarreer = new Carreer();
	
	myCarreer.setJob("Network admin");
	myCarreer.setYears(10);
	myCarreer.setSalary(200.00);
	
	System.out.println("Your job is " + myCarreer.getJob());
	System.out.println("The years on job is " + myCarreer.getYears());
	System.out.println("Your salary is " + myCarreer.getSalary());
	
}
}

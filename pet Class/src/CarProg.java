import java.util.*;
public class CarProg {


	public static void main(String[] args) {
		Car myCar = new Car(2008, "Chevy");
		
		for(int a = 0; a < 5; a++){
			myCar.Accelerate();
				System.out.println(myCar.getSpeed());
		}
		
		for(int b = 0; b < 5; b++){
			myCar.Brake();
				System.out.println(myCar.getSpeed());
		}

	}
	
	

}

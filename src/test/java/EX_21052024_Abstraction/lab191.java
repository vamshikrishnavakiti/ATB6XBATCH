package EX_21052024_Abstraction;

public class lab191 {
public static void main(String[] args) {
	car maruthi =new car();
	maruthi.bharathStage();
	System.out.println(maruthi.cc());
	maruthi.fueltype();
	
}
}
abstract class engine{
     abstract void fueltype();
     abstract String cc();
     abstract void bharathStage();
}

class car extends engine{

	@Override
	void fueltype() {
System.out.println("Petrol");		
	}

	@Override
	String cc() {
return "1500";		
	}

	@Override
	void bharathStage() {
System.out.println("6");		
	}
	
}


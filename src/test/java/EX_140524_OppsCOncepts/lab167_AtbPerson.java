package EX_140524_OppsCOncepts;

public class lab167_AtbPerson {
	String name;
	Long PhNumber;
	String email;
	String courseName;
	boolean isMarried;

	lab167_AtbPerson(){
		//Default constructor
		// Special method with no return type;
		// It is called when new object is created.
		// it has the same name as class
		System.out.println("Default constructor");
		courseName="ATB6X";
		
	}
	lab167_AtbPerson(String givenName, long givenPhone, String givenEmail){
		//Default constructor
		// Special method with no return type;
		// It is called when new object is created.
		// it has the same name as class
		name=givenName;
		PhNumber=givenPhone;
		email=givenEmail;
		courseName="ATB6X";
		
	}
	lab167_AtbPerson(String givenName, long givenPhone,boolean isMarried){
		name=givenName;
		PhNumber=givenPhone;
		this.isMarried=isMarried;
		
	}
	
	void printDetails() {
		System.out.println(name);
		System.out.println(PhNumber);
		System.out.println(email);		


	}
}

package EX_16052024_Inheritence;

public class lab171 {
	// What is inheritance?
	// Inherit Attributes and behavior from parents , Grand parents.

	// Superclass or parent class or base class
	// Subclass or child class derived class

	// Parent -> Child

	// Childs extends from parents{}
	//Extend Kayword - Parents attributes are available to the child(Class)
	public static void main(String[] args) {
		programming p = new programming(11,  " KO Posan");
		Java j = new Java("Lambda exp");
		p.print();
		j.print();
		programming python = new programming(12, " Van Russon");
		python.print();
		python.script();
	
	
	}
}

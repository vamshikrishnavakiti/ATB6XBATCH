package EX_16052024_Inheritence;

public class lab170 {
public static void main(String[] args) {
	// What is inheritance?
	// Inherit Attributes and behavior from parents , Grand parents.
	
	// Superclass or parent class or base class
    // Subclass or child class derived class
	
	// Parent -> Child
	
	// Childs extends from parents{}
	//Extend Kayword - Parents attributes are available to the child(Class)
	Child c = new Child();
	Child c2 = new Child("Sreehitha", 11);
System.out.println(c2.age);
System.out.println(c2.name);
	c.home();
}
}

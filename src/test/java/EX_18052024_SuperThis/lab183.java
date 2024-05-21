package EX_18052024_SuperThis;

public class lab183 {
	
public static void main(String[] args) {
	dog d1 = new dog(); // Constructor chaining.
	// If child constructor called parent constructor called automatically.
	dog d2= new dog("Labrodor");
	d2.diplay();
}
}
class Animal{
	String type;
	 Animal() {
		System.out.println("Animal -DC");
	}
	 Animal(String type){
		 this.type=type;
	 }
}

class dog extends Animal{
	String Breed;
	dog(){
		System.out.println("dog DC");
	}
	dog(String breed){
		super("Dog type");
	    this.Breed=breed;
	}
	void diplay() {
		System.out.println("Type: "+super.type + ",Breed:"+this.Breed);
	}
}
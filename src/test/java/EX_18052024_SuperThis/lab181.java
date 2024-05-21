package EX_18052024_SuperThis;

public class lab181 {
	public static void main(String[] args) {
		student s1 = new student();
		s1.display();

	} 
}
class person{

	void message (){

		System.out.println("I am a person");
	}
}
class student extends person{

	void message() {
		System.out.println("Iam astudent");
	}
	void display() {
		super.message(); // calling parent class method
	}
}
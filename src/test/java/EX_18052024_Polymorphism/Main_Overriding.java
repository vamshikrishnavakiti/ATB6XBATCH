package EX_18052024_Polymorphism;

public class Main_Overriding {
	public static void main(String[] args) {
		Dog_MOverring dog = new Dog_MOverring();
		dog.bark();
		Hound_Overring Hound = new Hound_Overring();
		Hound.bark();
		
		Dog_MOverring dog2 = new Hound_Overring();// Dynamic Dispatch or run time polymorphism
		dog2.bark();
	}
	
}

package EX_18052024_SuperThis;

public class lab182 {
public static void main(String[] args) {
	student1 s = new student1();
	// If child has default constructor, 
	// then parents constructor is called automatically.
	
	
}
}
class person1{
	int age;
	String name;
	person1(){
		System.out.println("this is person -DC");
	}
	person1(String a){
		System.out.println("Param cons");
	}
	person1(int a1){
		System.out.println("Param int cons");
		System.out.println(a1);
	}
	person1(String name , int age){
		System.out.println("Param cons");
		System.out.println(name+", Age-"+age);
	}
	
}
class student1 extends person1{
	
	student1(){
		
		//super(12);
		//super(123);
		super("Vamshi", 37);
		System.out.println("Iam student dc");
	}

}
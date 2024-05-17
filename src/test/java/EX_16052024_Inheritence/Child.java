package EX_16052024_Inheritence;

public class Child extends Father {
	String name;
	int age;
	
public void home() {
	System.out.println("3 BHK");
}
Child(){
	System.out.println("DF");
}
Child(String name , int age){
	this.name=name;
	this.age= age;
}
void print() {
	System.out.println(name);
	System.out.println(age);
}
}

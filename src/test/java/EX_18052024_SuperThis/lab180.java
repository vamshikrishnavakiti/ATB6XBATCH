package EX_18052024_SuperThis;

public class lab180 {
	public static void main(String[] args) {
		//Super keyword in java
		// Super keyword is a  reference of parent class
		//It can refer---->
		// variable of a parent 
		// method of a parent
		// Constructor of a parent
		car c = new car();
		//int speed=c.max_speed;
		//System.out.println(speed);
		c.display();
	}

}

  class vehicle{
	  int max_speed = 100; // instance variable.
	  
	  void message() {
		  System.out.println("This is vehicle class");
	  }
  }
  class car extends vehicle{
	private int max_speed=180;
	  
	  void display() {
		
		  System.out.println("Max speed of car can be :"+super.max_speed);
		  System.out.println("Max speed of can can be :"+this.max_speed);// here super keyword calling parents max speed.
	  }
  }
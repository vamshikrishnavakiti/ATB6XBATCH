package EX_07052024_Functions;

public class lab130_4typesfunctions {
	/*Types of Functions:
 There are four types of Functions are there:
 1) No return with No parameter
 2) No return with parameter
 3) Return with no parameter.
 4) Return with parameter.
	 */


	public static void main(String[] args) {

		// 1)  No return with No parameter.
		saySomethingPlease();

		//2)  No return with parameter
		sayHellotoyou("Vamshi");
		
		//3) Return with no parameter.
		sumoftwoBad(3,4);
		//4) Return with parameter.
		int result =sumoftwoGood(3,4);
		System.out.println(result);
 	}
	static void saySomethingPlease() {
		System.out.println("Non return with no patrams");
	}
	static void sayHellotoyou(String name) {
		System.out.println("Hello ,"+ name);
	}
	
	
	static void sumoftwoBad(int a, int b) {
		System.out.println(a+b);
	}
	static int sumoftwoGood(int a, int b) {
		return a+b;
	}
	
}

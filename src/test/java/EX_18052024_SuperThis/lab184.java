package EX_18052024_SuperThis;

public class lab184 {// Method chaining.
public static void main(String[] args) {
	p P = new p();
	P.m2();
}
}
class p{
	
	void m1() {
		System.out.println("M1");
	}
	void m2() {
		m1();
		System.out.println("M2");
	}
	
	
}
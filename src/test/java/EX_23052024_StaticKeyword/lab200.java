package EX_23052024_StaticKeyword;

public class lab200 {
	public static void main(String[] args) {
		A aRef = new A();
		A b = new A();
		A c = null;

		System.out.println(aRef.age);
		System.out.println(A.common);
		System.out.println(b.common);
		System.out.println(c.common);
		A.m1();
		b.m1();
		c.m1();
		aRef.m2();
		b.m2();
		c.m2();



	}
}

class A{
	int age =10;
	static String common ="ABC";
	static {
		System.out.println("A");
	}
	{
		System.out.println("IIB");
	}
	static void m1() {

	}
	void m2() {

	}
}

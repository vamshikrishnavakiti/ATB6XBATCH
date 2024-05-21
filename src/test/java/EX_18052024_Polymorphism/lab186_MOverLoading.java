package EX_18052024_Polymorphism;

public class lab186_MOverLoading {

	void gift(String a) {
		System.out.println("This is String: "+a);
	}
	int gift(int a) {

		return a;
	}
	int gift(float x) {
		System.out.println("X is a int: "+x);
		return 89;
	}
	void gift(double x) {
		System.out.println("X is double: "+x);
	}
	public static void main(String[] args) {
		lab186_MOverLoading mol =  new lab186_MOverLoading();
		int a =mol.gift(120);
		System.out.println(a);
		mol.gift(8.9);
		mol.gift("Doll");
	}
}

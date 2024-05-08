package EX_07052024_Functions;

public class lab128 {

	public static void main(String[] args) {
//Parameterized function.
		int r1=sumoftwo(5, 7);
		System.out.println(r1);
		int r2=sumoftwo(10, 22);
		System.out.println(r2);
		String r3 = sumoftwo("Vamshi", 66);
		System.out.println(r3);
	}
static int sumoftwo(int a,int b) {
	return a+b;
}
static String sumoftwo(String a, int b) {
	return a+b;
	
}
static String sumoftwo(int a, String b) {
	return a+b;
	
}
}

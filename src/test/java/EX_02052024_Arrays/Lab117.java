package EX_02052024_Arrays;

public class Lab117 {

	public static void main(String[] args) {
int[] a = {23,44,56,23,76};
int[] a2= {23,55,55,34,23};
System.out.println(a);
System.out.println(a2);
System.out.println(a==a2);
int[] a3=a2;
System.out.println(a2==a3);// "Primitive Data type"Checks for reference variable.
//This is coming form Object.java
String s1 ="Vamshi";
String s2="Vamshi";
System.out.println(s1.equals(s2)); // Non-Primitive CHecks for content
                                  // This is coming form String.java	
	}

}

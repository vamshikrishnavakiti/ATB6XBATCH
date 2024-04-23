package atb6xJavaPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value");
int value = sc.nextInt();
if(value%2==0) {
	System.out.println(value + " is even number");
}
else {
	System.out.println(value+" is odd number");
}
	}

}

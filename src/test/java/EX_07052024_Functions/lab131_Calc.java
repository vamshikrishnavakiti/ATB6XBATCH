package EX_07052024_Functions;

import java.util.Scanner;

public class lab131_Calc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number 1");
  int num1=sc.nextInt();
  System.out.println("Enter the Number 2");
  int num2=sc.nextInt();
  
     int result1=addition(num1,num2);
     System.out.println(result1);
     int result2=subtraction(num1,num2);
     System.out.println(result2);
     int result3=multiplication(num1,num2);
     System.out.println(result3);
     int result4=division(num1, num2);
     System.out.println(result4);
  
  
  
}

 static int addition(int a, int b) {
	return a+b;
}
 static int subtraction(int a, int b) {
		return a-b;
	}
 static int multiplication(int a, int b) {
		return a*b;
	}
 static int division(int a, int b) {
		return a/b;
	}
}

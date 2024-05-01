package EX_27042024;

import java.util.Scanner;

public class Lab112_Factorial {
//1!=1
	//2!=2*1
	//3!=3*2*1..
	//4!=4*3*2*1..
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int Num =sc.nextInt();
		long fact=1;
		for(int i =1; i<=Num;i++) {
			 fact=fact*i;
		}
		System.out.println("The Factorial of "+Num+" = "+fact);
	}

}

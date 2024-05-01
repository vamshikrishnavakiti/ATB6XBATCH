package EX_27042024;

import java.util.Scanner;

public class Lab95 {

	public static void main(String[] args) {
//Largest of three numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num1");
		int Num1=sc.nextInt();
		System.out.println("Enter the Num2");
		int Num2 = sc.nextInt();
		System.out.println("Enter the Num3");
		int Num3 = sc.nextInt();
		
		if(Num1> Num2 && Num1  >Num3){
			System.out.println(Num1+" Is the Largest number");
		}
		else if (Num2> Num1&& Num2>Num3) {
			System.out.println(Num2+" is Largerst number");
		}
		else {
			System.out.println(Num3+" is largest number");
		}
		sc.close();
	}

}

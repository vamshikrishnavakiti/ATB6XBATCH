package EX_27042024_Loops;

import java.util.Scanner;

public class Lab97 {
//LeapYear
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int Year = sc.nextInt();
		if((Year%4==0 && Year%100!=0) || (Year % 400 == 0)){
			System.out.println(Year+" is Leap year");
			}
		else {
			System.out.println(Year+" is not a leap year");
		}
		}
	}


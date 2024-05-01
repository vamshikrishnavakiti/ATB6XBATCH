package EX_27042024;

import java.util.Scanner;

public class lab96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Charector");
		   char ch =sc.next().charAt(0);
		   if((ch=='a')|| (ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
			   System.out.println("Enter Char is Vowel");
		   }
		   else if((ch=='A')|| (ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) {
			   System.out.println("Entered Char is Vowel");
		   }
		   else if((ch>'a' && ch<'z') || (ch >'A') &&(ch<'Z')) {
			   System.out.println("Invalit Entry");
		   }
		   else {
			   System.out.println("Consonant");
		   }

}}

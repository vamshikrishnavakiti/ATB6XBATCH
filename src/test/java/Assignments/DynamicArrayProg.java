package Assignments;

import java.util.Scanner;

public class DynamicArrayProg {

	public static void main(String[] args) {
		System.out.println("Enter the count of Subjects");
		Scanner sc = new Scanner(System.in);
		int sub_count=sc.nextInt();
		int[] marks = new int[sub_count];
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter the marks subject wise");
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]+" ");
		}
		
		int max =0;
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]>max)
				max=marks[i];
		}
       System.out.println("Maximum marks: "+max);
	}

}

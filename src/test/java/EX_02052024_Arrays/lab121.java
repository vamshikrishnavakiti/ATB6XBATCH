package EX_02052024_Arrays;

import java.util.Scanner;

public class lab121 {

	public static void main(String[] args) {
//Take inputs from user and store in array.
		Scanner sc = new Scanner(System.in);
		float[] marks = new float[6];
		System.out.println("Enter sub1 marsk");
		marks[0]=sc.nextFloat();
		System.out.println("Enter sub2 marsk");
		marks[1]=sc.nextFloat();
		System.out.println("Enter sub3 marsk");
		marks[2]=sc.nextFloat();
		System.out.println("Enter sub4 marsk");
		marks[3]=sc.nextFloat();
		System.out.println("Enter sub5 marsk");
		marks[4]=sc.nextFloat();
		System.out.println("Enter sub6 marsk");
		marks[5]=sc.nextFloat();
		    
		for(int i=0;i<marks.length;i++) {
			if(marks[(int) i]<35) {
				System.out.println("Fail in the sub "+marks[(int) i]);
			}
			else if(marks[i]>100) {
				System.out.println("Ur are god"+marks[i]);
				
			}
			else {
				System.out.println("U have cleared sub "+marks[i]);
			}
		}
		
		sc.close();
		
	}

}

package atb6xJavaPrograms;

import java.util.Scanner;

public class ArthemeticOperationnDemo {

	public static void main(String[] args) {
		System.out.println("Enter Input A");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Enter Inout B");
        int B = sc.nextInt();

        double result;
        System.out.println("Enter the operation to be performed.");
        char operation = sc.next().charAt(0);
        switch (operation){
            case '+':
                result=A+B;
                System.out.println(result);
                break;
            case '-':
                result =A-B;
                System.out.println(result);
                break;
            case '/':
                result=A/B;
                System.out.println(result);
                break;
            case '*':
                System.out.println(result=A*B);
                break;
            default:
                System.out.println("Unknown Operation");

        }
        sc.close();
	}

}

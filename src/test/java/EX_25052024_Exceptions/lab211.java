package EX_25052024_Exceptions;

public class lab211 {
    public static void main(String[] args) {
        //Exceptions
        String s1 = null;
        s1.trim();// Null pointer exception.

        int a=10;
        int c =a/0;
        System.out.println(c);
    }
}

package EX_25052024_Exceptions;

public class lab212 {
    public static void main(String[] args) {
       String sh = args[0];
      int a= Integer.parseInt(sh);

      int x= 10/a;
        System.out.println(a);
        System.out.println(x);
        // TC 1 : Input 5:
        // TC2 : input 0: // Arithmetic exception
        // TC3 : Special character:NumberFormatException
        //TC 4: No input:ArrayIndexOutOfBoundsException
        // TC5: Negative value:
        //TC 6 : String input:NumberFormatException


    }
}

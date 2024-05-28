package EX_25052024_Exceptions;

public class lab214 {
    public static void main(String[] args) {

try{
    String sh = args[0];// Excepting aurg
    int a= Integer.parseInt(sh);
    int x= 10/a;
    System.out.println(a);
    System.out.println(x);
}
catch(Exception e){

    System.out.println("Can u enter the input");// Custom error message
}


        //JVM will be initialized
        // created and start the main thread
        // main thread will have task - collecting arguments
        // main method will be called
    }
}

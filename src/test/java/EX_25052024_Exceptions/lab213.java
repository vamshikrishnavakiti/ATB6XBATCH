package EX_25052024_Exceptions;

import java.io.FileInputStream;

public class lab213 {
    public static void main(String[] args) {
        // Exception
        // Checked -JVM knows
        // Unchecked-
        try{
            FileInputStream file = new FileInputStream("c:/log.txt");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

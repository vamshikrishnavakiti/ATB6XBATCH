package EX_25052024_Exceptions;

public class lab216 {
    public static void main(String[] args) {
        try{String s1 ="Pramod";
            s1=null;
            int a =10/0;
            System.out.println(s1.trim());
        }catch (NullPointerException | ArithmeticException  e){
            System.out.println("Error");
        }
        catch (Exception e){
            System.out.println("Big error");
        }
    }


}

package EX_25052024_Exceptions;

public class BankRunner {
    public static void main(String[] args) throws Exception {
        bank ICICI = new bank("INR","10000");
    bank JP = new bank("USD","100");
        String total = ICICI.add(JP);
        System.out.println(total);


    }
}

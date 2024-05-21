package EX_18052024_Encapsulation;

public class BankRunner {

	public static void main(String[] args) {
     ICICBank i = new ICICBank("Vamshi", 100);
     System.out.println("Name before update: "+i.getName());
     i.setName("Vamshi Krishna",true);
     System.out.println("Name after Update is "+i.getName());
     System.out.println(i.getBal());
     i.setBal(10000);
     System.out.println(i.getBal());
	}
	

}

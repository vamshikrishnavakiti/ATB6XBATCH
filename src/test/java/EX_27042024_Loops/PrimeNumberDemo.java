package EX_27042024_Loops;

public class PrimeNumberDemo {
  
	public static void main(String[] args) {
		int PrimeNum =0;
for (int i=1;i<=100;i++) {
	if(1%i==i && i%i==1) {
		i=PrimeNum++;
	}
	System.out.println(i);
}
	}

}

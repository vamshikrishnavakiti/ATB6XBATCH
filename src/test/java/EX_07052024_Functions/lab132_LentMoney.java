package EX_07052024_Functions;

public class lab132_LentMoney {

	public static void main(String[] args) {
		lab132_LentMoney lb =new lab132_LentMoney();
		int back= lb.giveMoneyToFriend(100);
		System.out.println(back);
		 //_____________________________________________________//
		giveMoneytoUnknown();
		//________________________________________________________//
		int sum=sumOfToNumbers(30,49);
		System.out.println(sum);
	}

	static int sumOfToNumbers(int a,int b) {
		return a+b;		
	}

	static void giveMoneytoUnknown() {
		System.out.println("No money back");

	}

	 int giveMoneyToFriend(int a) {
		a=a+30;//Interest added
		return a;
	}

}

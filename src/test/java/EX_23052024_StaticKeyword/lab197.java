package EX_23052024_StaticKeyword;

public class lab197 {
	public static void main(String[] args) {
		ATB vamshi =new ATB("+919885621321");
		vamshi.printDetaisl();
		ATB Rahhu = new ATB("+112334432423");
		Rahhu.printDetaisl();
		System.out.println("Coursename is :"+ATB.courseName);
		
	}
}
class ATB{
	static //Static is called when a class is initiated.
	{
		System.out.println("Iam static");
	}
	static String courseName="ATB";
	String phoneNo;
	public ATB(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}
	void printDetaisl() {
		System.out.println("Your Details : "+phoneNo);
	}
	
	
	
}
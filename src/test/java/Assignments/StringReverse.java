package Assignments;

public class StringReverse {

	public static void main(String[] args) {
String Name="Testing Academy";
String revName="";
for(int i=Name.length()-1;i>=0;i--) {
	revName=revName+Name.charAt(i);
}
System.out.println("Reversed string :"+revName);

	}

}

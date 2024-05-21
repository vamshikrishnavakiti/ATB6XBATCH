package EX_18052024_Encapsulation;

public class lab189 {
public static void main(String[] args) {
	gmailLogin gl = new gmailLogin("admin", "admin123");
	//gl.password="admin321";
	System.out.println(gl.password);
	
}
}
class gmailLogin{
	
	String username;
	String password;
	public gmailLogin(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	
	
}
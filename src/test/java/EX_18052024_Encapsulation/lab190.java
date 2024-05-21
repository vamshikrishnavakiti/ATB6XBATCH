package EX_18052024_Encapsulation;

public class lab190 {
	//Privare
	// Use setters and getters with condition to secure your data members 
	// hide the data members-encap
public static void main(String[] args) {
	gmailLogin1  g2 = new gmailLogin1("Admin", "Admin123");
	String username=g2.getUsername();
	System.out.println("User Name is: "+username);
	//Code to Auth is Auth =true.
	//String Password=g2.setPassword("Amin123");
	//System.out.println(Password);
	String password=g2.getPassword(true);
	System.out.println("Password is: "+password);
	String Password=g2.setPassword("Admin321", false);
	System.out.println("New Password is: "+Password);
	
}
	
	
	
	
}
class gmailLogin1{
	private String username;
	private String password;
	public gmailLogin1(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword(boolean isAuth) {
		if(isAuth) {
			return password;
		}
		else {
			return "Not allowed";
		}
		
	}
	public String setPassword(String password ,boolean isAuth) {
		if(isAuth) {
			this.password = password;
			return password;
		}
		else {

			return "Not allowed";
		}
		
		
	}
	
}
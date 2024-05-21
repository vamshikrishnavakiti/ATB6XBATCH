package EX_18052024_Encapsulation;

public class ICICBank {
	
	
private String name;
private long bal;


public ICICBank(String name, long bal) {
	
	this.name = name;
	this.bal = bal;
}


public String getName() {
	return name;
}
public void setName(String name, boolean isAuth) {
	if(isAuth) {
		this.name = name;
	}
	else {
		System.out.println("Not allowed");
	}
}
public long getBal() {
	return bal;
}
public void setBal(long bal) {
if(bal>0) {	
	this.bal = bal;
	}
else {
	System.out.println("Not allowed");
}
}


}

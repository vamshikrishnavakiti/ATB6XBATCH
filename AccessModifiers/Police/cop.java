package Police;

public class cop {
public int gun; // access by any one.

private String idCcard;// Only available to current class.

public cop(int gun){
	this.gun=gun;// Param cons
}

protected void canIShoot() {
	System.out.println("Of course u can shoot");
}

}

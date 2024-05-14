package EX_11052024_ClassObject;

public class ATBStudenyts {

	public static void main(String[] args) {
		ATBXStudentds studs = new ATBXStudentds();
		studs.name="Vamshi";
		studs.S_ID="001";
		studs.DateOfJoining="12-Jan-2024";
		studs.Location="Hyderabad";
		
		String course =studs.JavaSelected("Atumation");
		System.out.println(course);
		studs.ModeOfClass("Online");
		studs.fee();
		
		studs.name="Naveen";
		studs.S_ID="002";
		studs.DateOfJoining="13-Jan-2024";
		studs.Location="Banglore";
		
		String course2 =studs.JavaSelected("Pyton");
		System.out.println(course);
		studs.ModeOfClass("Offline");
		studs.fee();
		
		
	}

}

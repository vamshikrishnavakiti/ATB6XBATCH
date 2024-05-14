package EX_11052024_ClassObject;

public class EmpDetails {

	public static void main(String[] args) {
		lab161 emp1 = new lab161();
		System.out.println(emp1.name="Vamshi");
		String empDOB=emp1.dob="16-01-1990";
		String empAdd=emp1.address="Hasthinapuram, Hyderabad";
		System.out.println("DATE OF DOB "+empDOB);
		System.out.println("Emp Location :"+empAdd);
		emp1.communiction("English");
        emp1.skillSet();
		String pos=emp1.position("Sr. QA");
		System.out.println(pos);
		System.out.println("Package: "+emp1.SalPackage()+" LPA");
	}

}

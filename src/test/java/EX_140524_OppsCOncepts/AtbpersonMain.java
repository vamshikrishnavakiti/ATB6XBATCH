package EX_140524_OppsCOncepts;

public class AtbpersonMain {

	public static void main(String[] args) {
		
		lab167_AtbPerson amit = new lab167_AtbPerson();
		System.out.println(amit.courseName);
		lab167_AtbPerson vamshi = new lab167_AtbPerson();
		 System.out.println(vamshi.courseName);
		 lab167_AtbPerson person1 = new lab167_AtbPerson("Peron",9885621321l, "Vamshi@gmail.com");
		 person1.printDetails();
		/*
		 * student1.name="Vamshi"; student1.PhNumber=9885621321l;
		 * student1.email="vamshivakitigmail.com";
		 */
		
	}

}

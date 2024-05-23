package EX_23052024_StaticKeyword;

import javax.sound.midi.Soundbank;

public class lab198 {
	public static void main(String[] args) {
		person p1 = new person("Vamshi");
		p1.print();
String p=person.gender;
System.out.println(p);
	}
}


class person{
	String name;
	static String gender="Male";
	public person(String name) {
		super();
		this.name = name;
	}
	void print() {System.out.println(this.name); 
	}

}
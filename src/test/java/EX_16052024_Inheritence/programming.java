package EX_16052024_Inheritence;

public class programming {
	int version;
	String author;

	programming(){
		System.out.println("DC");
	}
	programming(int version, String author) {
		
		this.version = version;
		this.author = author;
	}
	void print() {
		System.out.println(this.version +""+this.author);
	}
	void script(){
		System.out.println("Script of programming");
	}
}

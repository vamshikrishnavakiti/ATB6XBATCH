package EX_16052024_Inheritence;

public class Lab174 {

	public static void main(String[] args) {
Test t1 = new Test();
t1.openSQL();
int v=t1.API_Version;
System.out.println(v);
t1.openExcel();
t1.OpenJson();
	}

}

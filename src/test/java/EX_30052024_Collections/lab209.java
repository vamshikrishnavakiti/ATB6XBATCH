package EX_30052024_Collections;

import java.util.ArrayList;
import java.util.List;

public class lab209 {

	public static void main(String[] args) {
		List <String> courselist= new ArrayList();
		courselist.add("Java");
		courselist.add("Python");
		courselist.add("CSharp");
		courselist.add("Api");
		
		System.out.println(courselist);
		
		List numList= new ArrayList();
		numList.add(123);
		numList.add(234);
		numList.add(555);
		numList.add(777);
		
		courselist.addAll(numList);
		
		System.out.println(courselist);
		
		
	}

}

package EX_30052024_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab210 {

	public static void main(String[] args) {
		List  courselist= new ArrayList();
		courselist.add("Java");
		courselist.add("Python");
		courselist.add("CSharp");
		courselist.add("Api");
		courselist.add(222);
		courselist.add(20.45);
		courselist.add(true);
		
		Iterator iterator = courselist.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if(obj instanceof String) {
				System.out.println(obj);
			}
			else  {
				System.out.println("Not A String");
			}
			
		}
		
		System.out.println("_________________________________________");
		for (Object course : courselist) {
			System.out.println(course);
		}
		for(int i=0; i<courselist.size();i++) {
			System.out.println(courselist.get(i));
		}
	}

}

package EX_30052024_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class lab211 {

	public static void main(String[] args) {
		List  courselist= new ArrayList();
		courselist.add("Java");
		courselist.add("Python");
		courselist.add("CSharp");
		courselist.add("Api");
		courselist.add(222);
		courselist.add(20.45);

		// ListIterator will iterate from right to left
		// While we iterate we are not allowed to add new item. 
		ListIterator lt = courselist.listIterator(courselist.size());
		
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());

		}
	}

}

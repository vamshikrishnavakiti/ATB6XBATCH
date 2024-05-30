package EX_28052024_Collections;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Lab204 {

	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add("Vamshi");
		myList.add("Sangeetha");
		myList.add(null);
		myList.add(null);

		myList.size();
		System.out.println(""+myList);
		for(int i =1;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("-------------------------------------");

		for(Object myList1:myList) {
			System.out.println(myList1);
		}
		myList.add(3, "Sreehitha");
		System.out.println(myList);
	}

}

package EX_30052024_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingDemo {
public static void main(String[] args) {
	List<Integer> marks = new ArrayList<Integer>();
	marks.add(46);
	marks.add(445);
	marks.add(98);
	marks.add(23);
	Collections.sort(marks);
	System.out.println(marks);
}

}

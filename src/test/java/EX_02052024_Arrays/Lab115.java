package EX_02052024_Arrays;

public class Lab115 {
public static void main(String[] args) {
	int[] ages = {34,56,98,66,98,11,};
	//Fixed elements.
	
	int[] ages2 = new int[5];
	ages2[0]=67;
	ages2[1]=27;
	ages2[2]=47;
	ages2[3]=67;
	ages2[4]=07;
	System.out.println(ages[0]);
	System.out.println(ages[4]);
	String[] names = {"Vamshi","Raghu", "Rahul","Raghu","Uday"};
	for(String n:names)
	{
		System.out.println(n);
	}
	int size =names.length;
	System.out.println(size);
	
}
}

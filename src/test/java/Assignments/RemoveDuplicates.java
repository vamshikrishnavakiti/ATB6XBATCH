package Assignments;

public class RemoveDuplicates {
public static void main(String[] args) {
	String Input ="Hello world Welcome to the new vission";
	String output= RemoveDuplicates(Input);
	System.out.println(output);
}

public static String RemoveDuplicates(String str) {
	StringBuilder output = new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char currentChar =str.charAt(i);
		boolean foundDuplicates =false;
		for(int j=0;j<output.length();j++) {
			if(currentChar==output.charAt(j)) {
				foundDuplicates=true;
				break;
			}
		}
		if(!foundDuplicates) {
			output.append(currentChar);
		}
	}
	return output.toString();
}
}

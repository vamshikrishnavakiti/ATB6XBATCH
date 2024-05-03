package EX_02052024_Arrays;

public class Lab114 {
	public static void main(String[] args) {
		int[] ages1= {33,44,55,66,17,65,88,};
		int[] ages = new int[5];
		ages[0]=11;
		ages[1]=20;
		ages[2]=45;
		ages[3]=55;
		ages[4]=67;
		
		for(int i=0; i<ages1.length;i++) {
			System.out.println(ages1[i]);
		}
		System.out.println("_____________________________");
		for(int x:ages) {
			System.out.println(x);
		}
		System.out.println(ages.length);
		
		}
	}



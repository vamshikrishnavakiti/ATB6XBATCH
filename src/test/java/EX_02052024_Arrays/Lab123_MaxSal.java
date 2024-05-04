package EX_02052024_Arrays;

public class Lab123_MaxSal {

	public static void main(String[] args) {
		int sal[]= {30,65,77,12,33,10,99};
		int max =0;
		for(int i=0;i<sal.length;i++) {
			if(sal[i]>max) {
				max=sal[i];
			}
		}
		//While Loop
		/*
		 * int j=0; 
		 * while (j<sal.length) {
		 * if(sal[j]>max)
		 * { max=sal[j];
		 *  }
		 *  j++;
		 *  }
		 */
		System.out.println(max);
	}

}

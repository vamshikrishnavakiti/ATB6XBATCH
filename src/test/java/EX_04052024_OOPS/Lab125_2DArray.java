package EX_04052024_OOPS;

public class Lab125_2DArray {

	public static void main(String[] args) {
		//Initialization
		int[][] array2d= {
				{11,22,33},
				{12,22,23},
				{31,32,33}
		};
		//Normal initialization.
		/*int [][] array_2d2=new  int[3][3];
		 array_2d2[0][0]=11;
		 array_2d2[0][1]=12;
		 array_2d2[0][2]=13;
		 array_2d2[1][0]=21;
		 array_2d2[1][1]=22;
		 array_2d2[1][3]=23;
		 array_2d2[2][0]=31;
		 array_2d2[2][1]=32;
		 array_2d2[3][2]=33; */
		 
		 //Print the 2d_Array
		 for (int i=0;i<=2;i++) {
			 for(int j=0;j<=2;j++) {
				System.out.print(array2d[i][j]+" "); 
			 }
			 System.out.println();
		 }
		
	}

}

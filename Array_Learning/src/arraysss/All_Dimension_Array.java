package arraysss;

public class All_Dimension_Array {

	public static void main(String[] args) {
		
		//int x[][][]= {1,2,3,4,5,6,7,8,9,10,11,12}; //2,2,3
			
		//One Dimensional Array
		int[] b= {1,2,3,4,5};
		System.out.println("***********************");
		System.out.println("This Is 1D Array");
		System.out.println("***********************");
		for(int i=0;i<5;i++) {
			System.out.print(" "+b[i]);
		}
		
		System.out.println(); //Space Between Two Arrays.
		System.out.println("***********************");
		
//***********************************************************************************
		
		//Two Dimensional Array.
		int[][] t= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		System.out.println("This Is 2D Array");
		System.out.println("***********************");
		for(int i=0;i<3;i++) { //I Indicates Number Of Rows. J indicates Number Of Columns. 
			for(int j=0;j<3;j++) {
				System.out.print(" "+t[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("***********************");//for space between these two arrays.
		
//***********************************************************************************
		
		//Three Dimension Array.
		
				/*1 2 3   1 2 3  //i=number of dimension of array.j=number of rows of the array.
				  4 5 6   4 5 6  //k=number of column of the array.
				 */				 //Number counts as Index value.
				
		int a[][][]= {
					 {{1,2,3},{4,5,6}},	//[2][2][3]
					 {{7,8,9},{10,11,12}}//First 2 indicates dimension of the array.
					 };					//second 2 indicates rows of array,3 indicates column of the array.
		
		System.out.println("This Is 3D Array");
		System.out.println("***********************");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
				
		/*for(int i=0;i<a.length;i++) {  //length variable instead of number of dimension,rows,column.
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
		}*/
		
	}
	
}

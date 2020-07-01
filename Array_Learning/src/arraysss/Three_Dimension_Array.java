package arraysss;

public class Three_Dimension_Array {

	public static void main(String[] args) {
		
		int a[][][] = new int[3][3][3]; //First 4=4Times, 4=4Rows, 4=4Columns.
		System.out.println("---3D Array---");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				for(int k=0;k<3;k++) 
				{
					a[i][j][k]=i+j+k;
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}	
			System.out.println();
		}
		//Two Dimension Array:
		String [][] s= {
				{"Selvi","Balu","Sandy"},
				{"Selvi","Balu","Sandy"},
				{"Selvi","Balu","Sandy"},
		};
		System.out.println("----Two 2D Array---");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(" "+s[i][j]);
			}
			System.out.println();
		}
		
	}
}

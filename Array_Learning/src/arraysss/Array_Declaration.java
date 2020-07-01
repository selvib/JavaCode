package arraysss;

public class Array_Declaration {

	public static void main(String[] args) {

		// Declaring array by allocating memory space
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;

		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		System.out.println(a.length);// Returns number of Row

		for (int i = 0; i < a.length; i++) { // Row
			for (int j = 0; j <= 2; j++) {   //Column
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("******");
//****************************************************************************************//		

		// Declaring array by array literal
		int b[][] = { { 2, 5, 8 }, { 8, 9, 7 } };
		
		
//****************************************************************************************//		
		int c[][] = new int[4][4];
		c[0][0] = 2;
		c[0][1] = 4;
		c[0][2] = 5;
		c[0][3] = 5;

		c[1][0] = 3;
		c[1][1] = 4;
		c[1][2] = 7;
		c[1][3] = 5;

		c[2][0] = 3;
		c[2][1] = 3;
		c[2][2] = 3;
		c[2][3] = 5;

		c[3][0] = 5;
		c[3][1] = 6;
		c[3][2] = 7;
		c[2][3] = 5;
	
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}

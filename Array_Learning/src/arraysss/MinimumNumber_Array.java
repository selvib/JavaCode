package arraysss;

public class MinimumNumber_Array {

	public static void main(String[] args) {

		int a[][] = { { 32, 40, 50 }, { 30, 40, 70 }, { 15, 21, 19 } };

		int min = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				
				int num = a[i][j];
				
				if(num<min) 
					min=num;
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(min);
	}

}

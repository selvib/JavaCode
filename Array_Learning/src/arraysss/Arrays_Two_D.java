package arraysss;

public class Arrays_Two_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{0,1,0},
					   {2,3,2},
					   {4,5,4},
					   };
		//System.out.println(num[0][0] + " "+ num[0][1] +" "+num[0][2]);
		//System.out.println(num[1][0] +" "+ num[1][1] +" "+num[1][2]);
		//System.out.println(num[2][0] +" "+ num[2][1] +" "+num[2][2]);	
		//System.out.println(num[3][0] +" " + num[3][1] +" "+num[3][2]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+num[i][j]);
			}
			System.out.println();
		}
		
			
	}

}

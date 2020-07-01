package for_loop_learning;

public class Simple_Pattern {

	public static void main(String[] args) {
		
		System.out.println("*********");
		System.out.println("Pattern");
		System.out.println("*********");
		
		for(int i=1; i<=5; i++) {
			//System.out.println();
			for(int j=1; j<=i; j++) {  //Here j=i 'cause we need output in the form of I value.here we reiterate I value.we don't need J value.
				System.out.print("* "); //That's y we evaluate J value with I each and every sequence.    
			}
			System.out.println();
		}

		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/*int down_dots=5;
		for(int i=1; i<=down_dots; i++) {
			for(int j=down_dots; j>=i; j--) {
				System.out.print(1+" ");
			}
			System.out.println();
		}*/
	}

}

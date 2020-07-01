package for_loop_learning;

public class Arrow_Loop {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
		
			for(int j=1; j<=i; j++) {
				System.out.print("* "+"");
			}
			System.out.println();
		}
		int down_dot=4;
		for(int i=1; i<=down_dot; i++ ) {
			for(int j=down_dot; j>=i; j--) {
				System.out.print("* "+"");
			}
			System.out.println();
		}

	}

}

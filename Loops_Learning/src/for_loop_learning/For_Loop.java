package for_loop_learning;

public class For_Loop {

	public static void main(String[] args) {
		
		for(int i = 0; i<=3; i++) { //Outer Loop.
			System.out.println("****************");
			System.out.println("For I Value: "+i);
			System.out.println("****************");
			for(int j=1; j<=4; j++) { //Inner Loop.
				System.out.println("i=" +i +", "+ "j=" +j);
			}
		}
	}

}

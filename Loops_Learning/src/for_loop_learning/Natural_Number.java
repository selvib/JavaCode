package for_loop_learning;

public class Natural_Number {

	public static void main(String[] args) {
		int sum = 0;
		//       1.   2,5,8    4,7
		for(int i=1;i<=100;i++) { //Initialization Section Executed Only Once in for-loop life cycle.
			//    3,6
			sum=sum+i;
		}
		System.out.println("Sum Of Natural Number is: "+sum);

	}

}

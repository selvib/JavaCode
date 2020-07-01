package arraysss;

public class Second_Highest_Numer {

	public static void main(String[] args) {
		
		int[] num = {20,40,50,210,250,10};
		
		int largest = num[0];
		int secondLargest = num[0];
		
		//System.out.println(largest + " " + secondLargest);
		
		System.out.println("The given array is:" );
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t"); // /t-->Tab Between Two Numbers
		}
		for (int i = 0; i < num.length; i++) {
 
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
 
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is: " + secondLargest);
	}

}

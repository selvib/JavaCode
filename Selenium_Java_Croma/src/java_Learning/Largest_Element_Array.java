package java_Learning;

public class Largest_Element_Array {

	public static void main(String[] args) {
		int[] arr = { 5, 209, 0, 10, 96, 21 };
		int len = arr.length;

		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 1; i < len; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest Num Of Given Array Is : " + largest);
		System.out.println("Smallest Num Of Given Array Is :" + smallest);
	}
}

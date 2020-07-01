package java_Learning;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {

		int[] numbers = { 4, 17, 13, 12, 11, 35, 15, 7, 19, 3, 45 };

		int temp = numbers[0];
		int num;

		for (int i = 1; i < numbers.length; i++) {
			if (temp < numbers[i]) {
				System.out.println("Temp" + temp);
				temp = numbers[i];

			} else {
				num = numbers[i];
				System.out.println("Num" + numbers[i]);
			}

		}

	}
}
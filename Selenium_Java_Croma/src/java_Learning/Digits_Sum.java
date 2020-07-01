package java_Learning;

public class Digits_Sum {

	public static void main(String[] args) {
		int num = 749;
		int x;
		int sum = 0;

		while (num > 0) {
			System.out.println(num);
			x = num % 10;
			System.out.println(x);
			sum = sum + x;
			System.out.println(sum);
			num = num / 10;
			System.out.println(num);
//			n = m % 10;
//			int y = m / 10;
//			int z = n+y;
		}
		System.out.println("Sum Of The Digits Are : " + sum);
	}
}

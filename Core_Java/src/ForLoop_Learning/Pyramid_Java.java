package ForLoop_Learning;

public class Pyramid_Java {

	public static void main(String[] args) {
		/*1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */

		int k = 1;

		for (int i = 4; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(k + " ");
				k++;
			}

			System.out.println();
		}

		System.out.println("************");

		int m = 1;
		for (int i = 0; i <= 4; i++) {

			for (int j = 1; j <= 4 - i; j++) {

				System.out.print(m + " ");
				m++;
			}

			System.out.println();
		}
	}

}

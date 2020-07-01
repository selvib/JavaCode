package arraysss;

public class Cisco_Interview_Questions {

	public static void main(String[] args) {

		int a[][] = { { 32, 40, 72 }, { 30, 55, 70 }, { 22, 21, 19 } };

		int min = a[0][0];
		int min_Col = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {

				int num = a[i][j];

				if (num < min) {
					min = num;
					min_Col = j;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(min_Col);
		System.out.println(min);

		int max = a[0][min_Col];
		int k = 0;
		while (k < 3) {
			if (a[k][min_Col] > max) {
				max = a[k][min_Col];
			}
			k++;
		}

		System.out.println(max);

	}

}

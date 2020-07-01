package Collection_FrameWorkd;

import java.util.ArrayList;

public class Printing_Unique_Number {

	public static void main(String[] args) {

		int a[] = { 4, 4, 4, 6, 6, 6, 6, 7, 7, 7, 7, 7, 3, 3, 10 };
		System.out.println(a.length);

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				k++;
				al.add(a[i]);

				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " Is Occured");
				System.out.println(k + " times");
			}
		}

	}

}

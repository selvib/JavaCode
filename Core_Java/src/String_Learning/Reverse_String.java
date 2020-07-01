package String_Learning;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "madam";

		String t = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			t = t + s.charAt(i);
		}

		System.out.println(t);

		if (s.contains(t))
			System.out.println("Its a Palindrome");
		else
			System.out.println("its not a Palindrome");
	}

}

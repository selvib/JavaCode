package java_Learning;

public class Equality_String {

	public static void main(String[] args) {
		String str1 = "Selenium Automation";
		String str2 = "selenium auTomation";

		// we can use quality of two string with indexOf() and length()
		if (str1.indexOf(str2) >= 0 && str1.length() == str2.length()) {
			System.out.println("Its Equal");
		} else {
			System.out.println("Its Not Equal");
		}

		// we can use Inbuilt function also
		System.out.println(str1.equals(str2)); // check both length and index
		System.out.println(str1.contains(str2)); // only check match element since java is case sensitive it will also
													// check uppercase and lowercase
		System.out.println(str1.equalsIgnoreCase(str2)); // will ignore case sensitive.
	}
}

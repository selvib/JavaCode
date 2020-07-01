package browser;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		if (a>b) {
			System.out.println("a is greaterthan b");
		}
		else {
			System.out.println("b is greaterthan a");
		}
		if (b>c) {
			System.out.println("b is greaterthan c");
		}
		else {
			System.out.println("c is greaterthan b");
		}
		if (a>c) {
			System.out.println("a is greaterthan c");
		}
		else {
			System.out.println("c is greaterthan d");
		}
		if (a>d) {
			System.out.println("a is greaterthan d");
		}
		else {
			System.out.println("d is greaterthan a");
		}
		if (b>d) {
			System.out.println("b is greaterthan d");
		}
		else {
			System.out.println("d is greaterthan b");
		}
		if (c>d) {
			System.out.println("c is greaterthan d");
		}
		else {
			System.out.println("d is greaterthan c");
		}
	}

}

package Constructor_Learning;

public class Class_A {
	
	public Class_A() {
		System.out.println("Im Default Constructor");
	}
	
	public Class_A(int a, int b) {
		System.out.println(a + " "+ b);
	}
	
	public Class_A(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	public void samp() {
		System.out.println("Im Method From Parent");
	}

	public static void main(String[] args) {
		

	}

}

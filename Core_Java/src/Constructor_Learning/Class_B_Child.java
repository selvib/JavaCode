package Constructor_Learning;

public class Class_B_Child extends Class_A{
	
	public Class_B_Child() {
		super();
		System.out.println("Im Default From Child");
	}

	public Class_B_Child(int i, int j) {
		super(i, 10);
		System.out.println("Im Default From Child");
	}
	
	public Class_B_Child(int i, int j, int k) {
		super(i, j, k);
		System.out.println("Im Default From Child");
	}
	
	public static void main(String[] args) {
		Class_B_Child b = new Class_B_Child();
		b.samp();
		Class_B_Child b1 = new Class_B_Child(10, 20);
		Class_B_Child b2 = new Class_B_Child(10, 20, 30);
	}


}

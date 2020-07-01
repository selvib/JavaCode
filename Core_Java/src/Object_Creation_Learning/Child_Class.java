package Object_Creation_Learning;

public class Child_Class {

	public static void main(String[] args) {
		Child_Class c = new Child_Class();

		System.out.println(c.add(10, 20));
		
		c.add1(20, 20);
		c.Samp();
		
		System.out.println(c.str());
		
	}

	public void Samp() {
		System.out.println("Im From child");
	}

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("hai");
		return c;

	}

	public void add1(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public String str() {
		System.out.println("Im String Method");
		return "Pass";
	}
}

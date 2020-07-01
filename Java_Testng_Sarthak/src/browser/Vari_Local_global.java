package browser;

public class Vari_Local_global {
	static double height = 5.3;
	String name = "Selvi Balusamy";
	static char c = 'S';
	int age = 27;
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		int i = 10;
		String dress = "Saree";
		System.out.println(i);
		System.out.println(dress);
		
		Vari_Local_global sam = new Vari_Local_global();//we can create anywhere with different Object reference name.
		sam.sample();
		sam.age=27;
		sam.name="Sandy";
		
		test();
		test();//we can call many times.it will give same output.
		Vari_Local_global.test();		
	}
	public static void test() { //static is class property.local variable can't be static even its in static.
		int a =10;  //static method can call other static not non-static.
		int b = 20; //we can call static with object reference of the class.
		int sum = a+b;
		System.out.println("The sum is:"+sum);
		
	}
	public void sample() {//non static can call static and non static.
		System.out.println("This is not");
	}
	

}

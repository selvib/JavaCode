package arraysss;

public class Variablesss {
	String name;
	static int age;
	int rollnum;
	static int strengthofclass=10;

	public static void main(String[] args) {
		//variables inside class is global vari... inside method is local vari.
		Variablesss sam = new Variablesss();
		sam.sampleTest();
		sam.name="selvi";
		sam.rollnum=20;
	}
	
	public static void test() {
		int a =10;
		System.out.println(a);
		
	}
	
	public void sampleTest() {
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a+b+c;
		System.out.println(sum);
		test();//we can call static method inside non-static method.static and non-static very imortent
		//sam.name="hai";
	}

}

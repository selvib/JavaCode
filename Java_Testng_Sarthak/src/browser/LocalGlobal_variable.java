package browser;

public class LocalGlobal_variable {
	
	static String name="Mathu";
	static char c = 'M';
	static int m_num=1234567890;

	String city = "TN";
	int age = 20;

	public static void main(String[] args) {
		
		System.out.println("This is From Method");
		LocalGlobal_variable lb1 = new LocalGlobal_variable();
		lb1.age=30;
		//LocalGlobal_variable.sample1();
		//lb1.sample1();//we can call static with object reference also but it gives warning.but we should not call static by object reference its bad practice.
		//sample1();
		System.out.println("name"+name);
		lb1.add3();
		lb1.add1();
		LocalGlobal_variable obj = new LocalGlobal_variable();
		obj.add4();
	}
	public static void sample1() {
		System.out.println("This is from sample1");
		sample2();
		String name = "Selvi";
		System.out.println("name" + name);
		//sample3();
	}
	public static void sample2() {
		System.out.println("This is from sample2");
		sample3();
		String name="Usha";
		System.out.println("name"+name);
	}
	public static void sample3() {
		System.out.println("This is from sample3");
		//sample1(); //we can't call again which is already called inside the Main.
		
		LocalGlobal_variable samp = new LocalGlobal_variable();
		samp.add4();//By creating the particular static object we can call non-static method from static method.
	}
	public void add1() {
		System.out.println("This is from add1");
		sample1();
		LocalGlobal_variable ad1  = new LocalGlobal_variable();
		ad1.add3();
		ad1.age=90;
		System.out.println(age);
	}
	public void add2() {
		System.out.println("This is from add2");
		sample1();
	}
	public void add3() {
		System.out.println("This is from add3");
		add2();
	}
	public void add4() {
		System.out.println("This is from Add4");
	}
}

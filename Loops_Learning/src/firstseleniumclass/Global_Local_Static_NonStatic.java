package firstseleniumclass;

public class Global_Local_Static_NonStatic {
	static int age = 30;     //static Global Variable
	double height = 5.1;   //non-static Global Variable
	public static String name = "Hello";  //static global variable but the access modifier/specifier is public in nature
	
	//Static can access static (method, global variable) - Exception is none of the static methods can call main. But main can call all the static methods
	//local variables are neither static nor non-static
	//static can call itself directly or via class name. 
	//what is an object - instance of a class
	//actual definition - object stores all the non-static entities of the class (height, Mohit())

	public static void main(String[] args) {
		
		System.out.println("this is the main method");
		
		Global_Local_Static_NonStatic.main(args = new String[2], args = new String[4]);
		main(args = new String[3], args = new String[4]);
		
		Suresh();
		Global_Local_Static_NonStatic.Suresh();
		int age = 35;
		Global_Local_Static_NonStatic objref = new Global_Local_Static_NonStatic();
		objref.Mohit();
		objref.height = 6.2;
	}
	
	public static void main(String[] args1, String[] args2) { //main method overloading.
		System.out.println("this is the over loaded main method");
	}
	
	public static void Suresh() {
		String employer = "Accenture";
		System.out.println(employer);
		Sarthak();
		
		Global_Local_Static_NonStatic objref1= new Global_Local_Static_NonStatic();
		//objref1.Mohit();
		objref1.Sarthak();
	}
	
	public static void Sarthak() {
		String employer = "YouTube";
		System.out.println(employer);
	}
	
	public void Mohit() {
		String employer = "Yahoo";
		System.out.println(employer);
		Suresh();
	}

}

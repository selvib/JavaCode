package firstseleniumclass;

public class Main_Method_Overloading {

	public static void main(String[] args) {
		System.out.println("This is from main");
		
		Main_Method_Overloading.main(10, 20);
		main(30,40);
		main(50,60);
		main(70,80,90);
		main("Selvi","Balusamy");
		Main_Method_Overloading.main("Selvi","Balusamy","TamilNamdu");
	}
	public static void main(int a, int b) { //we can call another method inside the another method.
		System.out.println(a+" "+b);
		//these both create loop hole..Uncomment this it will not stop to execute.so we have to avoid loophole.
		//main("Selvi","Balusamy","TamilNamdu"); 
		//main("Selvi","Sandy");
	}
	public static void main(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
		Main_Method_Overloading.main("Selvi","Balusamy","TamilNamdu");
		main("Selvi","Balusamy","TamilNamdu");
		//main("Selvi","Jessy");
	}
	public static void main(String first_name,String second_name) {
		System.out.println(first_name+" "+second_name);
		main("Hai","Selvi","Balusamy");
		main(100,200,300);
	}
	public static void main(String first_name,String second_name,String state) {
		System.out.println(first_name+" "+second_name+" "+state);
		main(1000,2000);
	}
}

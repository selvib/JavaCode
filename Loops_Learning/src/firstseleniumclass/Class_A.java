package firstseleniumclass;
	
class A{
	
	int a=250,b=150;	
	
	public void add() {
		int c= a+b;
		System.out.println(c);
	}
}

class B extends A{
	public void sub() {
		int d = a-b;
		System.out.println(d);
	}
	
	public static void main(String[]args) {
		B cls = new B();
		cls.add();
		cls.sub();
	} 
	
}		
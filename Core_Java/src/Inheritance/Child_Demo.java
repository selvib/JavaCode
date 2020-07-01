package Inheritance;

public class Child_Demo extends Parent_Demo {
	
	String name = "QAClickAcademy";

	public Child_Demo() {
		super();// this should be always be at first line
		System.out.println("child class construtor");

	}

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
		super.getData();
		
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		Child_Demo cd = new Child_Demo();
		
		//System.out.println(super.name);can't use Super in Static

		cd.getStringdata();
		cd.getData();

	}

}

package Inheritance;

public class Child_SingleInheritance extends Parent_SingleInheritance {

	int i = 20;

	public void samp1() {
		System.out.println("Hello I'm From Child");
	}

	public static void main(String[] args) {

		Child_SingleInheritance c = new Child_SingleInheritance();
		System.out.println("This is From Parent" + c.i);

		Parent_SingleInheritance p = new Child_SingleInheritance();
		System.out.println("This is From Child" + p.i);

	}

}

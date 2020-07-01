package Package_Learning_Two;

import Package_Learning.Access_Modifiers;
import Package_Learning.Class_A;

public class Class_B extends Access_Modifiers {

	protected void getData_Protected() {
		System.out.println("Hello Im GetData Method with Protected from Class_B");
	}

	public static void main(String[] args) {

		Class_A a = new Class_A();
		a.samp();// here we don't inherit class_A so we created obj of class_A and this is Public method

		System.out.println("*************Access Modifiers**************");

		// Protected Modifiers
		// Access_Modifiers am = new Access_Modifiers(); with this object we can't call
		// Protected method of Parent class
		Class_B b = new Class_B();// With child class object only we can call Protected in Parent Class
		b.getData_Protected();

		// Public
		Access_Modifiers am = new Access_Modifiers();
		am.getData_Public();
		b.getData_Public();
	}

}

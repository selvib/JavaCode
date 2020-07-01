package Collection_FrameWorkd;

import java.util.ArrayList;

public class ArrayList_Learning {
	
//List interface - AL,LL,Set implementing this interface and allow duplicate values
//array is fixed in size and AL grow dynamically so this is also know as Dynamic Array
//You can access and insert any value in any Index

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Selvi");
		al.add("Automation Tester");
		al.add("Blacky");
		System.out.println(al);

		al.add(2, "Tomy");
		al.add("Balu");
		System.out.println(al);

		System.out.println(al.isEmpty());
		
		al.ensureCapacity(5);
		
		System.out.println(al.get(2));
		
		System.out.println(al.size());
		
		System.out.println(al.contains("Selvi"));
		
		System.out.println(al.indexOf("Balu")); //Not in Set as it is not stored the element in Sequential order
		
		System.out.println(al.remove(3));
		System.out.println(al.removeAll(al));
		System.out.println(al.isEmpty());
		System.out.println(al);
	}

}

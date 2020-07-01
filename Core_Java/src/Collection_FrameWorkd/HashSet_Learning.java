package Collection_FrameWorkd;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet_Learning {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Selenium");
		hs.add("TestNG");
		hs.add("C++");
		hs.add("Java");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Java"));
		System.out.println(hs.size());
		hs.remove("C++");
		System.out.println(hs);
		hs.add("C++");
		System.out.println("*************************************");
		
		//When we execute the order of HashSet value is changed......
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}

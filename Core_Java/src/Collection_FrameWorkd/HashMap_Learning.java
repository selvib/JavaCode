package Collection_FrameWorkd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Learning {

	public static void main(String[] args) {
		
	HashMap<String, String> hm = new  HashMap<String,String>();
	hm.put("Selvi", "Balusamy");
	hm.put("Sandy", "Ravi");
	hm.put("Valar", "Samy");
	hm.put("Maddy", "Balu");
	hm.put("HEllo", "Balu");
	System.out.println(hm);
	System.out.println(hm.get("Maddy"));
	hm.remove("Sandy");
	System.out.println(hm);
	
	Set<Entry<String, String>> hm_Set = hm.entrySet();
	Iterator<Entry<String, String>> hm_It = hm_Set.iterator();
	while(hm_It.hasNext()) {
		//System.out.println(hm_It.next());
		//Casting for getting key and value separately from the Set
		Map.Entry me = (Map.Entry)hm_It.next();
		System.out.println(me.getKey());
		System.out.println(me.getValue());
	}
	}

}

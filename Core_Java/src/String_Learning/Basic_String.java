package String_Learning;

public class Basic_String {

	public static void main(String[] args) {
		
		//1.
		String a = "Hello Selvi";
		System.out.println(a);
		
		//2.
		String b = new String("Hello World");
		System.out.println(b);
		
		
		System.out.println(b.charAt(4));
		System.out.println(b.indexOf("d"));
		System.out.println(b.lastIndexOf("o"));
		System.out.println(b.substring(0, 8));
		System.out.println(b.substring(4));
		
		System.out.println(b.concat("Welcome Selvi"));
		
		System.out.println(b.length());
		
		String c = new String("     Hello World");
		System.out.println(c.trim());
		
		System.out.println(a.toUpperCase());
		
		//Spilt 
		String[] arr = a.split("o");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(String ar : arr) {
			System.out.println(ar);
		}
		
		a.replace("o", "A");
		
		
	}
	

}

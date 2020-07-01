package Variables_Learning;

public class Instance_Local_Class {

	String name; // Instance Variables
	String address;
	int m = 0;
	
	static String city = "Bangalore"; // Class Variables
	static int i = 0;
	static String State;

	static {
		State = "Karnataka";
	}

	Instance_Local_Class(String name, String address) {
		this.name = name;
		this.address = address;
//For the first object creation it will incremented to one next object creation it will two like that it will be same no obj freshly start as 0		
		i++;
		System.out.println(i);
		
		//As it is non static for every obj creation it takes m value as 1 incremented value will not be considered
		m++;
		System.out.println("M value "+m);

	}

	public void getData() { // Instance Methods
		System.out.println(name + " " + address + " " + city);
	}

	public static void getStaticData() { // Class Methods
		System.out.println(city + " " + State);
	}

	public static void main(String[] args) {

		Instance_Local_Class lc = new Instance_Local_Class("Selvi", "Srinagar");
		Instance_Local_Class lc1 = new Instance_Local_Class("Balusamy", "AK Colony");
		Instance_Local_Class lc2 = new Instance_Local_Class("Tomi", "AK Colony");
		lc.getData();
		lc1.getData();

		lc.address = "Anna Nagar";// At run time changing value but not affect original value

		getStaticData();
		Instance_Local_Class.city = "Coimbatore";// At run time changing value but not affect original value
		System.out.println(Instance_Local_Class.city = "Coimbatore");

		System.out.println(i);
		System.out.println(lc.m);
		System.out.println(lc1.m);
	}

}

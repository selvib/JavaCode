package Constructor_Learning;

public class Constructor_Java {

	String Name;  //Global or Instance variable
	int Age;
	String Place;
	
	public void vari(String Name, int Age, String Place) {
		this.Name=Name; //Name is Local variable this scope only belongs to this method
		this.Age=Age;
		this.Place=Place;
		System.out.println(this.Name + " " + this.Age + " " + this.Place);
		System.out.println(Name + " " + Age + " " + Place);
	}
	public  Constructor_Java() {
		
	}
	public  Constructor_Java(String Name, int Age, String Place) {
		this.Name = Name;
		this.Age = Age;
		this.Place = Place;
	}
	
	public static void main(String[] args) {
		 
//		Constructor_Java obj = new Constructor_Java();
//		obj.Age = 28;
//		obj.Name ="Selvi";
//		obj.Place="Noida";
//		System.out.println(obj.Age);
//		System.out.println(obj.Name);
//		System.out.println(obj.Place);
		//To avoid hard code every value we can just create constructor and can pass value as arguments.
		Constructor_Java obj = new Constructor_Java("Selvi", 27, "Noida");
		Constructor_Java obj1 = new Constructor_Java("Mathu", 22, "Kovai");
		Constructor_Java obj2 = new Constructor_Java("Meenu", 20, "NewYork");
		Constructor_Java obj3 = new Constructor_Java("Tomi", 18, "California");
		System.out.println(obj.Age + " " + obj.Name + " " + obj.Place);
		System.out.println(obj1.Age + " " + obj1.Name + " " + obj1.Place);
		System.out.println(obj2.Age + " " + obj2.Name + " " + obj2.Place);
		System.out.println(obj3.Age + " " + obj3.Name + " " + obj3.Place);
		
		Constructor_Java obj4 = new Constructor_Java();
		obj4.vari("Sandy", 45, "Canada");
		obj.vari("Blacky", 10, "US");
		
	}

}

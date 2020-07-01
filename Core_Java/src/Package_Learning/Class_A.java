package Package_Learning;

public class Class_A  extends Access_Modifiers {

	public void samp(){
		System.out.println("Hello i'm from Class_A of Package_Learnig ");
	}
	
	
	
	public static void main(String[] args) {
		
		//Protected accessed by the class in same package
		Access_Modifiers am = new Access_Modifiers(); //Here Protected accessed by both Parent and child class Obj
		am.getData_Protected();
		Class_A a = new Class_A();
		a.getData_Protected();
		
		//cant access Private
		//am.getData_Private();
		
		//Public can accessed anywhere in any Package of Class
		am.getData_Public();
	}

}

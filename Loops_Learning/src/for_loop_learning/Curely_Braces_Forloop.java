package for_loop_learning;

public class Curely_Braces_Forloop {
	
	/*for(int j=0;i<=10;i++)
		int x=10;*/ //Not valid.
	
	//for(int k=0;i<=10;i++);  This is valid.

	public static void main(String[] args) {
		//Initialization section, condition check, increment/decrement section.
		/*1. In the initialization section we can declare and initialize local variable of for-loop.Here we can declare any number of variable but should be of same type.
		 if we try with different type of variable we will get compile time error. In the initialization section we can any valid java statement
		 including SYSO statement also.
		 int i=0;
		for(System.out.println("Hai From I"); i<3; i++) {
			System.out.println("Hai From Body");
		}
		 2.Conditional Section:Here we can take any valid java expression but should be a Boolean type(a>b & b>30 || k<l).This is optional part if we dont mention
		 conditional check compiler always take "True".
		 int i=0
		 for(System.out.println("Hai From I"); ; i++) {
			System.out.println("Hai From Body");
		 }	
		3.Increment/Decrement Section:We can take any valid java statements including SYSO statement.
		int i=0;
		 for(System.out.println("Hai From I"); i<3;System.out.println("HAI")) {

			 i++;		 
		} 
		
		All Three Parts of For-Loop are Independent to each other.
		*/
		
		/*for(int a=0;true;i++)  
			System.out.println("Hello");*/ //This is valid.. we can write single syso statement without curly braces.but it executes continuously..
		
		//for(int a=0,b=1;)
		
		int i=0;
		 for(System.out.println(i+"Intial I Hai"); i<3;System.out.println(i+" Incremental I"+ ":" +" Hello")) {
			 System.out.println(i+" Incremental I Hello from body");
			 i++;		 
		}
		 
		System.out.println("********************************");
		
		int m=0;
		for(System.out.println(m+"Intial I"+"Hai"); m<3;System.out.println("Befor Increment M: "+m+", "+m++ +", "+"After Increment: "+m)) {

			 System.out.println(m+" Incremental I Hello");		
		}
				 
	}

}

package java_Learning;

public class For_Loops_Java {

	public static void main(String[] args) {
		int[] arrMarks = {45,56,34,68,38,17};

		System.out.println("The Pass Marks Are:");
		for(int i=0; i<arrMarks.length; i++) {
			
			if(arrMarks[i]>=40) {
				
				System.out.println(arrMarks[i]);
			}
		}
		System.out.println("******************");
		System.out.println("An Even Marks Are:");
		for(int i=0; i<arrMarks.length; i++) {
			
			if(arrMarks[i]%2==0) {
				
				System.out.println(arrMarks[i]);
			}
		}
		System.out.println("******************");
		System.out.println("An Odd Marks Are:");
		for(int i=0; i<arrMarks.length; i++) {
			
			if(arrMarks[i]%2!=0) {
				
				System.out.println(arrMarks[i]);
			}
		}
		System.out.println("******************");
		int[] arrYears = {2011,2008,1998,1990,2004};
		System.out.println("Leap Years Are");
		for(int i=0; i<arrYears.length; i++) {
			if(arrYears[i]%4==0) {
				System.out.println(arrYears[i]);
			}
		}
		System.out.println("******************");
//		for(int i=0; i<arrYears.length; i++) {
//			if(arrYears[i]%4==0) {
//				System.out.println(arrYears[i]);
//				if(arrYears[i]%4!=0) {
//					
//				}
//			}
//		}

	
	}
}

package java_Learning;

public class Word_Count_String {
	

	public static void main(String[] args) {

//		int ass = str.charAt(0);
//		System.out.println(ass);
		
//		int chr = 'z';
//		System.out.println(chr);
		
//		for(int len=0; len<str.length();len++) {
//			int assc = str.charAt(len);
//			System.out.println(assc);
//			for(int assci=str.length(); assci<=str.length(); assci++) {
//				char y = str.charAt(len);
//				//System.out.println("Index Of "+ len + " Element Is " + y);
//				int num = y;
//				System.out.println("Assci Value of " + y + " is " + num);				
//			}
//	    }
		Word_Count_String obj = new Word_Count_String();
		obj.count();
	}
	
	public int count() {
		String str = "Selenium Automation Testing";
		
		int leng = str.length();
		char ch = 'e';
		int counter = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				counter++;
				
			}
		}
		return counter;
	}

}

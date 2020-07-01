package Constructor_Learning;

public class Methods_Java {

	public static void samp() {
		System.out.println("Hello samp ");
	}

	public static void samp1() {
		System.out.println("Hello samp1");
	}

	public static void samp2() {
		System.out.println("Hello samp2");
	}

	public void samp3() {
		System.out.println("Hello samp3");
	}

	public static void main(String[] args) {

	    samp();

	    Methods_Java.samp1();
	    
		Methods_Java sam = new Methods_Java();

		sam.samp2();
		sam.samp3();

	}

}

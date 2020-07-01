package Exception_Learnig;

public class Exception_Samp {

	public static void main(String[] args) {
		int a = 7;
		int b = 0;
		int c = 0;
		// try can be followed by multiple catch block
		// catch should be an immediate block after try
		try { // We can define the code which will throw an error or Exception in the try
				// block
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {// Specifically we mention this will catch only this exception if any other occur it will not catch
			System.out.println("Cannot Divide by Zero");
		} catch (Exception e) { // this is Parent exception it will catch all the exception
			System.out.println("I Catched the Error/Exception");
		} finally {// This block will be executed irrespective of exception thrown or not. should use along with try and catch block
			System.out.println("Deleted Cookies");
		} // we can use try and finally combination by skipping catch
//In testing we use finally for to close the browser of deleting cookies irrespective the executed code pass or fail.. we delete for next test execution
//By forcing JVM to stop the execution we can stop finally block to be executed
	}

}

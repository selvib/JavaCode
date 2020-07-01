package TestNG_FrameWork;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Personal_Loan {

	@AfterMethod
	public static void a_After() {
		System.out.println("I Will Be There After Every Method Of P_Loan After_Method");
	}

	@BeforeClass
	public static void before_Class() {
		System.out.println("I Will Be There Before This Class Methods Executed Im Before_Class");
	}

	@Parameters({"URL","APIkey/Uname"})
	@Test
	public static void p_Loan(String uname, String na) {
		System.out.println("********************");
		System.out.println("Ploan URL");
		System.out.println(uname);
		System.out.println(na);
		System.out.println("********************");
	}

	@Test
	public static void pname() {
		System.out.println("Pname Test Case");
	}
	
	//<listeners>
//    <listener class-name="TestNG_FrameWork.Listeners"/>
//  </listeners>
}

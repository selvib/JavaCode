package TestNG_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home_Loan {

	@AfterSuite
	public static void after() {
		System.out.println("I am the Last IM After_Sutie");
	}

	@Parameters({ "URL" })
	@Test
	public static void homeweb_Login(String uname) {
		System.out.println("********************");
		System.out.println("Home Web Login URL");
		System.out.println(uname);
		System.out.println("********************");
	}

	@Test(groups = { "Smoke" })
	public static void homemobile_Login() {
		System.out.println("Home Mobile Login");
	}

	@AfterClass
	public static void after_Class() {
		System.out.println("I will Be There After This Class's Whole method executed IM After_Class");
	}

	@Test(timeOut = 4000)
	public static void homeapi_Login() {
		System.out.println("HomeApi Login");
	}

	@Test(dependsOnMethods = { "homeweb_Login", "homeapi_Login" })
	public static void home_Singin() {
		System.out.println("Home Singin");
	}

	@Test(enabled = false)
	public static void homeapi_Singout() {
		System.out.println("HomeApi Singinout");
	}
}

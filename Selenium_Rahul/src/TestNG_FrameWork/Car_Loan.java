package TestNG_FrameWork;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Car_Loan {

	@Test
	public static void carweb_Login() {
		System.out.println("Car Web Login");
	}

	@BeforeMethod
	public static void b_Method() {
		System.out.println("I will Be There b4 Every Method of Car_Loan Im Before_Method");
	}

	@Test(groups = { "Smoke" })
	public static void carmobile_Login() {
		System.out.println("Car Mobile Login");
	}

	@BeforeSuite
	public static void carapi() {
		System.out.println("I am the No One Before_Suite");
	}

	@Test
	public static void carapi_Login() {
		System.out.println("Car Api Login");
	}
}

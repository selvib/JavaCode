package testng_learning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_Test_AM_Tricombo {
	@BeforeMethod
	public static void BM() {
		System.out.println("This is BM");
	}
	@Test
	public static void Test1() {
		System.out.println("This is Test1");
	}
	@Test
	public static void Test2() {
		System.out.println("This is Test2");
	}
	@Test
	public static void Test3() {
		System.out.println("This is Test3");
	}
	@Test
	public static void Test4() {
		System.out.println("This is Test4");
	}
	@AfterMethod
	public static void AF() {
		System.out.println("This is AF");
	}
}

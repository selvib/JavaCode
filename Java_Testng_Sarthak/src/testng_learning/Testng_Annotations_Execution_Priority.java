package testng_learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Annotations_Execution_Priority {
	@BeforeSuite
	public static void BeforeSuite() {
		System.out.println("This is BeforeSuite");
	}
	
	@BeforeTest
	public static void BeforeTest() {
		System.out.println("This is BeforeTest");
	}
	
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("This is BeforeClass");
	}
	
	@BeforeMethod
	public static void BeforeMethod() {
		System.out.println("This is BeforeMethod");
	}
	
	@Test
	public static void Test() {
		System.out.println("This is Test");
	}
	
	@AfterMethod
	public static void AfterMethod() {
		System.out.println("This is AfterMethod");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("This is AfterClass");
	}
	
	@AfterTest
	public static void AfterTest() {
		System.out.println("This is AfterTest");
	}
	
	@AfterSuite
	public static void AfterSuite() {
		System.out.println("This is AfterSuite");
	}
	
}

package TestNG_FrameWork;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {

	@AfterTest
	public static void samp_after() {
		System.out.println("I Will Be Executed Last Im After_Test");
	}

	@DataProvider
	@Test(dataProvider=("getData"))
	public static void samp1(String uname, String pwd) {
		System.out.println("Hello World ");
		System.out.println(uname);
		System.out.println(pwd);
	}

	@Test(groups = { "Smoke" })
	public static void samp2() {
		System.out.println("Hello Selvi Welcome");
	}

	@BeforeTest
	public static void samp_before() {
		System.out.println("I Will Be Executed First  Im Before_Test");
	}
	
	@DataProvider
	public Object[][]  getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Firstuname";
		data[0][1] = "pwd";
		
		data[1][0] = "seconduname";
		data[1][1] = "secondpwd";
		
		data[2][0] ="ThirdUname";
		data[2][1] = "Thirdpwd";
		
		return data;
	}

}

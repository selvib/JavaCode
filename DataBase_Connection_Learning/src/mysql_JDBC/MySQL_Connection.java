package mysql_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySQL_Connection {

	public static WebDriver driver;

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/sql_Password", "root", "3003mathuselvi");
		Statement stmt = connection.createStatement();
		ResultSet result_Data = stmt.executeQuery("select * from credentials where scenario='Uname1';");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		while (result_Data.next()) {
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(result_Data.getString("uname"));
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(result_Data.getString("pwd"));
		}

	}

}

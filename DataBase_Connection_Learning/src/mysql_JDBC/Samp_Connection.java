package mysql_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class Samp_Connection {
	public static WebDriver driver;

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/sql_Password",
				"root", "3003mathuselvi");
		Statement stmt = connection.createStatement();
		
		ResultSet result_Data = stmt.executeQuery("select * from credentials where scenario='Uname1'");

		while (result_Data.next()) {
			System.out.println(result_Data.getString("uname"));
			System.out.println(result_Data.getString("pwd"));
		}

		System.out.println("*******************");
		
		result_Data = stmt.executeQuery("select * from credentials");
		
		while (result_Data.next()) {
			System.out.println(result_Data.getString("uname"));
			System.out.println(result_Data.getString("pwd"));
		}

	}

}

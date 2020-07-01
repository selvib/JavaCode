package Selvi.DemoMavenProject;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{

    	public static void main1(String[] args) throws Exception {
    		
    		Properties prop = new Properties();
    		FileInputStream ip = new FileInputStream("C:\\Users\\selvi\\eclipse-workspace\\Automation_Practice\\src\\main\\java\\config.properties");
    		prop.load(ip);
    		
    		System.out.println(prop.getProperty("Browser"));
    		System.out.println(prop.getProperty("url"));
    }
}

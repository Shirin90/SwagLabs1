package swaglab.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasePage {
public static Logger logger;
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	public BasePage() {
		logger = Logger.getLogger("Swag labs Automation"); 
		PropertyConfigurator.configure("log4j.properties");
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/swaglab/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}  
	public void setUP() {
		logger.info("******** > Test excuted with chrome browser  < ***********");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.saucedemo.com/");
	}
}

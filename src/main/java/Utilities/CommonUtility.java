package Utilities;



import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import swaglab.basepage.BasePage;


public class CommonUtility extends BasePage {
static WebDriver  driver;
	public static void jsClick(WebElement elm) {
		JavascriptExecutor excuter = (JavascriptExecutor) driver;
		excuter.executeScript("arguments[0].click();", elm);
	}

	public static void acctionClick(WebElement ele) {
		Actions action = new Actions(driver);
		action.click(ele).build().perform();

	}

	public static WebElement getExplicitWait(WebElement elem, WebDriver driver, long time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elem));
		return element;

	}
	
	public static void getScreenshot(WebDriver driver, String pictureName) throws Throwable{
		
		TakesScreenshot obj = (TakesScreenshot)driver;  
		File file = obj.getScreenshotAs(OutputType.FILE); 
		Files.copy(file, new File ("./target/"+pictureName+".png"));
				
	}
	
//	public static void takeScreenShot() throws IOException {
//		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(System.getProperty("user.dir") + "//screenshot/screenshot.png");
//		targetFile.getParentFile().mkdir();
//		srcFile.createNewFile();
//		Files.copy(srcFile, targetFile);
//		
//	}

	
	public static void getIframe() {
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	}
	
	
	
	public static void getWindowHandles() {
		  String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator(); 
	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                    driver.switchTo().window(ChildWindow);
	                    driver.close();
	                    System.out.println("Child window closed");
	                 }	      
	        }        
	        //  Switch back to the main window which is the parent window.
	        driver.switchTo().window(mainWindowHandle);
	      
	}
	
	// How to handle the alert box/window/ pop up window 
	public static void getAlert() {
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        		
        // Accepting alert		
        alert.accept();		
    }
	}


package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
    System.setProperty("webdriver.chrome.driver","conf/browserdrivers/chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    Actions myActions = new Actions(driver);
    
    driver.get("https://www.selenium.dev/");
    
    String pageTitle = driver.getTitle();
    System.out.println(pageTitle);
    
    try { 
    	WebElement downloadEle = driver.findElement(By.xpath("//*[@id=\"navbar\"]/a[1]"));
    	
    	downloadEle.click();
    	
    	System.out.println(driver.getTitle());
    } catch (Exception e) {
    	System.out.println("Exception occured because there is no Download link in the page. Hence taking screenshot");
    TakesScreenshot takeScreenshotObj = (TakesScreenshot) driver;
    
    File screenshotFile = takeScreenshotObj.getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(screenshotFile, new File("screenshots/screenshot2.png"));
    
	
	System.out.println("Done with taking screenshot");
}

System.out.println("Done");

driver.quit();
}
}
    
    
    
    	
    
    
    
	



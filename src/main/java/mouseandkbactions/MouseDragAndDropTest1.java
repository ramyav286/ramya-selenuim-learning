package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
        
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
	WebElement sourceEle = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
	WebElement targetEle = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[2]"));
	
	Actions myActions = new Actions(driver);
	myActions.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
	
	System.out.println("Done");
	
	
	}

}

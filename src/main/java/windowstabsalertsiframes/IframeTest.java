package windowstabsalertsiframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/iframe-practice-page/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.switchTo().frame(0);
		
		WebElement iframe1Ele = driver.findElement(By.id("IF1"));
		driver.switchTo().frame(iframe1Ele);
		
		
		
		System.out.println("After Switching ===========================");
		
		WebElement linkElementInsideIFrame = driver.findElement(By.linkText("Software Testing Tutorial"));
		linkElementInsideIFrame.click();
		
		driver.switchTo().defaultContent();
		
		WebElement linkElementInsideParentPage = driver.findElement(By.linkText("Sortable"));
		linkElementInsideParentPage.click();
	}

}

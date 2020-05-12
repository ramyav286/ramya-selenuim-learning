package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement sourceLocator = driver.findElement(By.xpath("//*[@id=\"draga\"]"));
		WebElement targetLocator = driver.findElement(By.xpath("//*[@id=\"dragb\"]"));
		
		Actions myActions = new Actions (driver);
		myActions.dragAndDrop(sourceLocator,targetLocator).build().perform();
		
	

	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","conf/browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//Locate element
		WebElement searchElement = driver.findElement(By.tagName("button"));
		if (searchElement!=null) {
			System.out.println("search element found");
		}
		//perform action on element
		searchElement.sendKeys("my first name");
		
		

	}

}

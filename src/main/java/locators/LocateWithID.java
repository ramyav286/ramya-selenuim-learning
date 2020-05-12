package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithID {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//locate element
		WebElement emailElement = driver.findElement(By.id("email"));
		if (emailElement!=null) {
			System.out.println("Email element found");
			
			//perform action
			emailElement.sendKeys("My First name");
		}
		

	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		//locate element
		WebElement passwordElement = driver.findElement(By.name("pass"));
		if(passwordElement!=null) {
			System.out.println("passwordElement element found");
		}
		
		//perform action
		passwordElement.sendKeys("MySecretPassword");
		

	}

	
}

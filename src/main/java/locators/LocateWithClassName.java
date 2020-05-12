package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airbnb.co.in/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//locate element
		WebElement searchElement = driver.findElement(By.className("_m9v25n"));
		
		if(searchElement!=null) {
			System.out.println("searchElement element found");
			
			//perform action
			searchElement.click();
		}

	}

}

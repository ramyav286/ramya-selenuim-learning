package elementinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownInteractions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement monthDropdownElement = driver.findElement(By.xpath("//*[@id=\"month\"]"));
				
   Select monthSelection = new Select(monthDropdownElement);
   
   monthSelection.selectByIndex(6);
   monthSelection.selectByValue("1");
   monthSelection.selectByVisibleText("May");
	}

}

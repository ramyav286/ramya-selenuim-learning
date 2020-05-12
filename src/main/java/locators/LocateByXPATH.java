package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPATH {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
	WebElement emailElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"));
	
	emailElement.sendKeys("myemail");
	
	WebElement passElement = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	
	passElement.sendKeys("mypassword");
	}

}

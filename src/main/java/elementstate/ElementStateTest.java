package elementstate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStateTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		WebElement emailElement = driver.findElement(By.id("email"));

		System.out.println("Displayed ?" + emailElement.isDisplayed());
		System.out.println("Enabled ?" + emailElement.isEnabled());
		//System.out.println("Selected?" + emailElement.isSelected());
		System.out.println("======================");
		
		emailElement.sendKeys("myemailid");
		
		System.out.println("Displayed ?" + emailElement.isDisplayed());
		System.out.println("Enabled ?" + emailElement.isEnabled());
		//System.out.println("Selected?" + emailElement.isSelected());
		System.out.println("======================");
	
	WebElement femaleRadioElement=driver.findElement(By.xpath("//*[@id=\"u_0_9\"]"));
	
	System.out.println("Displayed ?" + femaleRadioElement.isDisplayed());
	System.out.println("Enabled ?" + femaleRadioElement.isEnabled());
	System.out.println("Selected?" + femaleRadioElement.isSelected());
	
	femaleRadioElement.click();
	System.out.println("======================");
	System.out.println("Displayed ?" + femaleRadioElement.isDisplayed());
	System.out.println("Enabled ?" + femaleRadioElement.isEnabled());
	System.out.println("Selected?" + femaleRadioElement.isSelected());
	
	
	
	}

}

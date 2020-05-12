package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Actions myActions = new Actions(driver);
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	
		
		WebElement emailEle = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement firstNameEle = driver.findElement(By.xpath("//*[@id=\"u_0_q\"]"));
		
		myActions.sendKeys("ramya").perform();
		
		myActions.moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
        myActions.moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
		
		
		myActions.moveToElement(firstNameEle).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		
		//myActions.moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).moveToElement(firstNameEle).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		System.out.println("Done");
	}

}

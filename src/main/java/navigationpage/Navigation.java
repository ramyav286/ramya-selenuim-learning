package navigationpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions myActions = new Actions(driver);
		
		driver.get("https://www.selenium.dev/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement downloadEle = driver.findElement(By.xpath("//*[@id=\"navbar\"]/a[1]"));
		
		downloadEle.click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Done");
		

	}

}

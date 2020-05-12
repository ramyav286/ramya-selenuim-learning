package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions myActions = new Actions(driver);
		
		driver.get("https://www.amazon.co.uk/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement primeMenuElement = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[3]/span[2]"));

	myActions.contextClick(primeMenuElement).build().perform();
	}

}

package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveToElementActions {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.get("https://www.toolsqa.com/");
        
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        WebElement aboutMenuElement = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a/span/span"));
        
        Actions myActions = new Actions(driver);
        
        myActions.moveToElement(aboutMenuElement).build().perform();

	}

}

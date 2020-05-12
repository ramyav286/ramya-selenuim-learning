package windowstabsalertsiframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement alertButtonEle = driver.findElement(By.id("alert"));
		alertButtonEle.click();
		
		System.out.println("Alert is shown but not yet acknowledged");
		
		Alert alertObj = driver.switchTo().alert();
		System.out.println("Text Present in alert is :" + alertObj.getText());
		
		alertObj.dismiss();
		
		WebElement newbrowserWindowElement = driver.findElement(By.id("button1"));
		newbrowserWindowElement.click();
				

	}

}

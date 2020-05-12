package elementinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteractions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement signupButtonElement = driver.findElement(By.xpath("//*[@id=\"u_0_13\"]"));
		
signupButtonElement.submit();
	}

}

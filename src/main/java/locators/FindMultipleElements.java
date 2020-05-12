package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		List <WebElement> linkElementsList =  driver.findElements(By.partialLinkText("Policy"));
		
		int numberOfMatchedLinks = linkElementsList.size();
		
		System.out.println("Number of Links With Policy" + numberOfMatchedLinks);

		List<WebElement> allLinksList = driver.findElements(By.tagName("a"));
	
	System.out.println("Total Number of Links" + allLinksList.size());
	
	for(WebElement eachLinkElement: allLinksList) {
		
		String hrefValue = eachLinkElement.getAttribute("href");
		
		System.out.println(hrefValue);
	}
	}

}

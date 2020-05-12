package windowstabsalertsiframes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsOrTabTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
     
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		System.out.println("Number of windows Before Click : " + driver.getWindowHandles().size());
		String parentWinHandle = driver.getWindowHandle();
		System.out.println("Driver is posession of the Window : " + parentWinHandle);
		
		WebElement newbrowserWindowElement= driver.findElement(By.id("button1"));
		
		newbrowserWindowElement.click();
		
		System.out.println("------------------------------------After Click  -----------------------------------------------");
		System.out.println("Number of windows After Click : " + driver.getWindowHandles().size());
		System.out.println("Driver is posession of the Window : " + driver.getWindowHandle());
		
		Set<String> allWinHandles = driver.getWindowHandles();
		
		String childWinHandle = null;
		
		for(String singWinHandle :allWinHandles ) {
			//System.out.println("Handle " + singWinHandle);
			if(!singWinHandle.equalsIgnoreCase(parentWinHandle)) {
				childWinHandle = singWinHandle;
			}
		}
		
		System.out.println("Now I know Child Win Handle : " + childWinHandle);
		
		System.out.println("Now I can switch to Child window Handle==================>");
		System.out.println(driver.getTitle());

		driver.switchTo().window(childWinHandle);
		
		System.out.println("Switched to Child window Handle================>");

		
		System.out.println(driver.getTitle());
		
		System.out.println("Done with actions on child window. Time to close child window ================");
		
		driver.close();
		//driver.quit();
		System.out.println("Closed Child window. Time to switch back to Parent window========");
		
		driver.switchTo().window(parentWinHandle);
		System.out.println(driver.getTitle());
	}

	}



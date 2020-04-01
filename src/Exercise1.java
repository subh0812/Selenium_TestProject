import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public void exercise1()
	{
		//Initial Setups
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Launch URL
				String strURL = "https://www.amazon.in/";
				driver.get(strURL);
				
				//Display current page title and its length
				System.out.println("Page Title: " + driver.getTitle());
				System.out.println("Title Length: " + driver.getTitle().length());
				
				//Compare if the current url is same
				String currentURL = driver.getCurrentUrl();
				if (currentURL.equals(strURL)) {
					System.out.println("Current url is same as expected");
				} else
				{
					System.out.println("Current url is Not same as expected, current url is: " + currentURL + ", and expected url is: " + strURL);
				}
				
				//get page source and its length
				String pageSrc = driver.getPageSource();
				System.out.println("Page Source Length: " + pageSrc.length());
				
				//Close the browser
				//driver.close();
				driver.quit();
	}
}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public void launchURL(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}


}

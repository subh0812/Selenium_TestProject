import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise0 extends Login {

	public static void main(String[] args) {
		
		//Initial Setups
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Launch URL
		String strURL = "https://www.amazon.in/";
		driver.get(strURL);
		
		//Click on link
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		
		//Navigate back
		driver.navigate().back();
		
		//Navigate forward
		driver.navigate().forward();
		
		//Navigate back
		driver.navigate().to(strURL);
		
		//Refresh
		driver.navigate().refresh();
				
		//Close the browser
		//driver.close();
		driver.quit();
	}

}

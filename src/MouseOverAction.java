import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Launch url
		driver.get("https://www.toolsqa.com/");
		
		Thread.sleep(3000);
		
		WebElement eleAbout = driver.findElement(By.xpath("//nav[@class='navigation']/ul[@id='primary-menu']//span[text()='ABOUT']"));
		WebElement eleContactUs = driver.findElement(By.xpath("//nav[@class='navigation']/ul[@id='primary-menu']//span[text()='Contact Us']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(eleAbout).perform();
		Thread.sleep(3000);
		action.moveToElement(eleContactUs);
		action.click();
		action.perform();
		
		
	}

}

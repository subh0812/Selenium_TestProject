import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowCommands {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Launch url
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		
		//Window Switch Example
		//Get current window name
		String firstWindow = driver.getWindowHandle();
		System.out.println("First Window ID is: "+firstWindow);
		
		WebElement newMessageWinButton = driver.findElement(By.xpath("//button[text()='New Message Window']"));
		newMessageWinButton.click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		
		/*
		//Method1:
		windows.remove(firstWindow);
		String nextWindow = windows.iterator().next();
		driver.switchTo().window(nextWindow);
		
		*/		
		
		//Method2
		for (String eachWindow:windows) {
			if (!eachWindow.equals(firstWindow)) {
				driver.switchTo().window(eachWindow);
				System.out.println("Switching to window ID :"+eachWindow);
				
			}
		}
				
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(firstWindow);
		System.out.println("Current window: "+driver.getWindowHandle());
		
	
		
		/*
		//Alert Example
		WebElement alertButton = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertButton.click();
		
		//Switch to alert and accept
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		*/
	
	}

}

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise2_CheckboxRadioButton {
	
	public static void main(String arg[])
	{
		//Initial Setups
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Launch web page
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//find radio buttons available under sex section and select Female option
		List<WebElement> radioButtons_sex = driver.findElements(By.name("sex"));
		for (WebElement option : radioButtons_sex) {
			if (!option.isSelected()) {
				if (option.getAttribute("value").equalsIgnoreCase("Female")) {
					option.click();
				}

			}
		}
				
		//find Years of Experience radio buttons and select 3rd options
		List<WebElement> radioButtons_exp = driver.findElements(By.name("exp"));
		for (WebElement option : radioButtons_exp) {
			if (!option.isSelected()) {
				if (option.getAttribute("value").equalsIgnoreCase("3")) {
					option.click();
				}

			}
		}
		
		//find Years of Experience radio buttons and select 3rd options
		List<WebElement> radioButtons_Profession = driver.findElements(By.name("profession"));
		for (WebElement option:radioButtons_Profession)
		{
			if (!option.isSelected()) {
				if (option.getAttribute("value").equalsIgnoreCase("Automation Tester")) {
					option.click();
				}

			}
		}
		
		
		//find Years of Experience radio buttons and select 3rd options
		List<WebElement> radioButtons_Tool = driver.findElements(By.name("tool"));
		for (WebElement option:radioButtons_Tool)
		{
			if (!option.isSelected()) {
				if (option.getAttribute("value").equalsIgnoreCase("Selenium IDE")) {
					option.click();
				}

			}
		}	
		
		
		
	}

}

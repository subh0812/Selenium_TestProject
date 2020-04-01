import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise3_DropDown_Multiselect extends DriverClass {
	
		
	public static void main(String arg[]) throws InterruptedException
	{
		
		//Initial Setups
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Launch browser
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//Identify Continent dropdown
		WebElement dropdown = driver.findElement(By.id("continents"));
		Select drpDown_Continents = new Select(dropdown);
		
		//Select "Europe" using selectByIndex
		drpDown_Continents.selectByIndex(1);
		Thread.sleep(5000);
		
		//Select "Europe" using selectByVisibleText
		drpDown_Continents.selectByVisibleText("Africa");
		Thread.sleep(5000);
		
		//Print all the available options
		List<WebElement> options = drpDown_Continents.getOptions();
		for (int i=0; i<options.size(); i++)
			System.out.println("Available Options under Continents dropdown are: "+options.get(i).getText());
		
		//Select "Europe" using selectByVisibleText
		drpDown_Continents.selectByValue("AS");
		
		
		/*Exercise 3.2 to work on multiselect options */
		//Identify Selenium Commands element
		WebElement SeleniumCommands = driver.findElement(By.id("selenium_commands"));
		Select options_SC = new Select(SeleniumCommands);
		
		//Select Browser Commands and deselect it
		options_SC.selectByIndex(0);
		Thread.sleep(2000);
		options_SC.deselectByIndex(0);
		Thread.sleep(2000);
		
		//Select Navigation Commands and deselect it
		options_SC.selectByVisibleText("Navigation Commands");;
		Thread.sleep(2000);
		options_SC.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		//Print and select all the options available
		List<WebElement> allOptions = options_SC.getOptions();
		for (WebElement eachElement:allOptions) {
			System.out.println(eachElement.getText());
			options_SC.selectByVisibleText(eachElement.getText());
		}
		Thread.sleep(2000);
		
		//Deselect All
		options_SC.deselectAll();
		
	}
	
	

}

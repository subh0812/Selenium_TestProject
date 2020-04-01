import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4_WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\Java_Handson\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Launch web page
		driver.get("https://demoqa.com/automation-practice-table/");
		
		//Get table row and column count
		//List<WebElement> table = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr"));
		int rowCount = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[1]/td")).size();
		
		for (int i = 1; i<=rowCount; i++)
			if (driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[" + i + "]/th")).getText().equalsIgnoreCase("Clock Tower Hotel"))
				for (int j=1; j<=colCount; j++) {
					System.out.println(driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText());
				}
		
				
				/*
			for (int j=1; j<=colCount; j++) {
				WebElement rowData = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[" + i + "]/td[" + j + "]"));
				if (rowData.getText().equals("Dubai")) {
					System.out.println(rowData.getText());
				}
			}	
		
		
				if (rowData.getText().equals("Details")) {
					System.out.println("To click on Link");
					WebElement rowDetails = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[" + i + "]/td[" + j + "]/a"));
					rowDetails.click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		*/
		
		//click on Detail link
		//driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[1]/td[6]/a")).click();
		//System.out.println("Clicked on Details Link");
	}

}

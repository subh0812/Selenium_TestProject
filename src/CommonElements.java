import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonElements extends DriverClass {
	
	public WebElement findElement(String identifier, String value)
	{
		WebElement element=null;
		switch (identifier)
		{
		case "id":
			element = driver.findElement(By.id(value));
			break;
			
		case "name":
			element = driver.findElement(By.name(value));
			break;
			
		case "className":
			element = driver.findElement(By.className(value));
			break;
			
		case "tagName":
			element = driver.findElement(By.tagName(value));
			break;
			
		case "linkText":
			element = driver.findElement(By.linkText(value));
			break;
			
		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(value));
			break;
			
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
		
		case "cssSelector":
			element = driver.findElement(By.cssSelector(value));
			break;
			
		default:
			System.out.println("No such type of element identifier found");
			
		}
		
		return element;
	}
	

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cleartrip_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		WebDriverWait d = new WebDriverWait(driver,60);
		d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("DepartDate"))));
		
		driver.findElement(By.id("DepartDate")).click();		
		
		while(!driver.findElement(By.xpath("//div[contains(@class,'last')]//div[@class='title']")).getText().contains("November 2020"))
			
		{
			driver.findElement(By.xpath("//a[contains(@class,'nextMonth ')]")).click();
			
		}
		
		
		List<WebElement> days = driver.findElements(By.xpath("//div[contains(@class,'last')]//a[@class='ui-state-default ']"));
		
		int count = days.size();
		
		for(int i = 0 ; i < count ; i++)
			
		{
			String S = days.get(i).getText();
			
			if (S.equalsIgnoreCase("23"))
				
			{
				days.get(i).click();
				break;
				
			}
		}
	}

}

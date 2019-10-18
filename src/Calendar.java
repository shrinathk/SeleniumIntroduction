import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		WebDriverWait d = new WebDriverWait(driver,10);
		d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("travel_date"))));
		
		driver.findElement(By.id("travel_date")).click();
		
		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']']")).getText().contains("November");
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']']")).getText().contains("November"))
			
		{
			
			driver.findElement(By.xpath("div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		
		List<WebElement> days = driver.findElements(By.className("day"));
		
		int count = days.size();
		
		
	for(int i = 0; i < count ; i++)
		
	{
		String text = days.get(i).getText();
		
		if (text.equalsIgnoreCase("23"))
			
		{
			days.get(i).click();
			break;
			
		}
		
	}
	
	
	}

}

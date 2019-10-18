import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Linkscountinthepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		// Count of links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// Count of links in the footer section
		System.out.println(driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size());
		
		int count = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]")).findElements(By.tagName("a")).size();
		
		for(int i=1 ; i< count  ; i++)
			
		{
			
			String Clickonthelink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]")).findElements(By.tagName("a")).get(i).sendKeys(Clickonthelink);						
		
		}
		
		 Set<String> abc =driver.getWindowHandles();
		 Iterator<String> it = abc.iterator();
		 
		 while (it.hasNext())
		 {
			 System.out.println(driver.switchTo().window(it.next()).getTitle());
			 
		 }
		 
	}
		

}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("Hyd");
		Thread.sleep(2000L);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
	JavascriptExecutor js = (JavascriptExecutor)driver;

	String script = "return document.getElementById(\"fromPlaceName\").value;";
	String text = (String) js.executeScript(script);
	
	int i = 0 ;
	
	while (!text.equalsIgnoreCase("HYDERABAD"))
	{
		
		i++;
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		text=(String)js.executeScript(script);
		
		if (i>10)
			
		{			
			System.out.println("Element not found");			
			break;			
		}
	}
	
	
	
	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
	
}

}

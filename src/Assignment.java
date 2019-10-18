import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) new Assignment();
		driver.findElement(By.xpath("//input[@name ='name']")).sendKeys("Niha");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("email")).sendKeys("abc@abc.com");
		WebElement dropdown = driver.findElement(By.name("country"));
		Select s = new Select(dropdown);
		s.selectByValue("Guam");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//fieldset/following-sibling::fieldset/input[@name='username']")).sendKeys("abc.123");
		Thread.sleep(2000L);
		driver.findElement(By.name("password")).sendKeys("abcd");
		
		
		driver.findElement(By.className("button")).click();
		
		
		
		

	}

}

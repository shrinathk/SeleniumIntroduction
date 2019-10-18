import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		Actions a = new Actions(driver);
		
		WebElement actn = driver.findElement(By.id("nav-link-accountList"));
		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//input[contains(@data-action-type,'DISMISS')]")).click();
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(actn).contextClick().build().perform();
		
		
		
		
	}
	

}

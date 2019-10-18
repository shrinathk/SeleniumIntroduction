import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switchingbetweenwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Neetu\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
	//	@SuppressWarnings("unused")
		String parentID=it.next();
		String childID= it.next();
		driver.switchTo().window(childID);	
	
		Thread.sleep(3000L);
		//WebDriverWait myWait=new WebDriverWait(driver,5);

		//myWait.until(ExpectedConditions.numberOfWindowsToBe(driver.getWindowHandles().size()));
		
		System.out.println(driver.getTitle());
	}

}

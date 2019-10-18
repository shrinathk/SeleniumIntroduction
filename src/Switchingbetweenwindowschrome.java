import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchingbetweenwindowschrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[contains(@href,'hl=en-GB')]")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
	//	@SuppressWarnings("unused")
		String parentID=it.next();
		String childID= it.next();
		driver.switchTo().window(childID);	
		
		System.out.println(driver.getTitle());
	}

}

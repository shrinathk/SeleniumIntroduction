package abc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selfpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//MOUSE OVER AN ELEMENT, SEARCH IN CAPS, GO TO THAT WINDOW, GET TITLE, CLOSE IT, GET BACK TO HOME PAGE, GET TITLE, CLOSE THE BROWSER
		Thread.sleep(5000L);
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.className("nav-line-2"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("potty chair for two year baby").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid);
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
	}

}

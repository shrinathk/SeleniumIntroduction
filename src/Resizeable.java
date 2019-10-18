import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Resizeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement switchToFrame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(switchToFrame);
		WebElement resizeable = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle')]"));
		WebElement width = driver.findElement(By.id("resizable"));
		int wide = width.getSize().width/2;
		int high = width.getSize().height/2;
		Actions a = new Actions(driver);
		a.dragAndDropBy(resizeable, 80, 26).build().perform();
		System.out.println("This is successful");
	}

}

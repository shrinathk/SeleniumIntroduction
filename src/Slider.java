import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement totalLength = driver.findElement(By.xpath("//div[@id='slider']"));
		
		int selectedWidth = totalLength.getSize().width/2;
		
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDropBy(slider, selectedWidth, 0).perform();

	}

}

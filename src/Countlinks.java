import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("way2automation");
		driver.findElement(By.xpath("//input[contains(@value,'Google Search')]")).click();
		driver.findElement(By.xpath("//div[@id='search']/div/div/div[1]/div/div/div/div/div/a/h3/div")).click();
		//WebDriverWait d = new WebDriverWait(driver, 15);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i = 0 ; i < links.size() ; i++) {
			System.out.println((i+1) + ". " + links.get(i).getText());
		}
		

	}

}

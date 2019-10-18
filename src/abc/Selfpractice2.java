package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selfpractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// PLACE AN ORDER IN FIRSTCRY
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		/*WebElement popUp = driver.findElement(By.xpath("//div[contains(@class,'_pop_close')]"));*/
		WebElement popUp = driver.findElement(By.xpath("//*[@id=\"amt\"]/div[2]/div[1]/div[1]/div[3]/div"));
		WebDriverWait d = new WebDriverWait(driver,40);
		d.until(ExpectedConditions.elementToBeClickable(popUp));
		popUp.click();
		
Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'diapering')]"))).build().perform();
		
		popUp = driver.findElement(By.xpath("//a[contains(@href,'/potty-training/1/28?ref2=menu_dd_diaprng')]"));
		
		d.until(ExpectedConditions.elementToBeClickable(popUp));
		popUp.click();
		
		popUp = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[2]/div[3]/div/div[2]/div[7]/a"));
		
		
		d.until(ExpectedConditions.elementToBeClickable(popUp));
		
		popUp.click();	
				
		
		
		

		
		
	}

}

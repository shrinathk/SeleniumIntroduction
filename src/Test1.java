import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement s = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input"));
		s.click();
		String value = s.getAttribute("id");
		System.out.println(value);
				
				
	 driver.findElement(By.id("dropdown-class-example")).click();
	 
	Select a = new Select(driver.findElement(By.id("dropdown-class-example")));
	
	a.selectByVisibleText(value.substring(8));
	
	driver.findElement(By.name("enter-name")).sendKeys(value.substring(8));
	driver.findElement(By.id("alertbtn")).click();
	
	Assert.assertTrue(driver.switchTo().alert().getText().contains(value.substring(8)));
	
	// t.findElement(By.linkText(value)).click();
	//Thread.sleep(2000L);
	//t.findElement(By.linkText(value)).sendKeys(Keys.ENTER);
	

	
		
		
		
	}

	private static void substring(int i) {
		// TODO Auto-generated method stub
		
	}

}

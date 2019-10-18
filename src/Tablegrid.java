import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0; 
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22902/ttn-vs-mnt-15th-match-round-1-global-t20-canada-2019");
		
		WebElement parent1 = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		
		int count = parent1.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
			
		for(int i = 0 ; i < count-2 ; i++)
		{
			
		 String value = parent1.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
		sum = sum +	Integer.parseInt(value);
		}
		
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		if (Integer.parseInt(total) == Integer.parseInt(extras) + sum)
		{
			
			System.out.println("True");
		}
		
		else
			
		{
			
			System.out.println("False");
			
		}
		
		}
		
		
		
		
	}



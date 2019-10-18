import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class tableSort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		Thread.sleep(2000L);
		
		 driver.findElement(By.xpath("//div[@class='wrapperTwo']/table/thead/tr/th[2]/b")).click();
		 //driver.findElement(By.xpath("//div[@class='wrapperTwo']/table/thead/tr/th[2]/b")).click();
		
		 List<WebElement> listOfVeg = driver.findElements(By.xpath("//tbody/tr/td[2]"));

		 ArrayList<String> originalList = new ArrayList<String>();
		 
		 for(int i = 0; i < listOfVeg.size(); i++)
		 {
			 originalList.add(listOfVeg.get(i).getText());    
		 }
		 
		 ArrayList<String> sortedList = new ArrayList<String>();
		 
		 for(int i = 0; i < originalList.size(); i++)
		 {
			 sortedList.add(originalList.get(i));
		 }
		 
		 Collections.sort(sortedList);
		 Collections.reverse(sortedList);
		 //To get both lists printed in cosole
		  
		 for(int i = 0; i < sortedList.size(); i++)
{
		System.out.println(sortedList.get(i));	
}

		 
		 for(int i = 0; i < originalList.size(); i++)
{
		System.out.println(originalList.get(i));	
}

		
		
		 
		 Assert.assertTrue(sortedList.equals(originalList));
		 
		 
		 }
		 
	}



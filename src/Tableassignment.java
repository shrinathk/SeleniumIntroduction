import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.className("table-display"));
		System.out.println(table.findElement(By.xpath("//table[@class='table-display']/tbody/tr[1]")).findElements(By.tagName("th")).size());
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody")).findElements(By.tagName("tr")).size());
		
		int count = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).findElements(By.tagName("td")).size();
		for(int i = 0; i< count ; i++)
		
		{
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).findElements(By.tagName("td")).get(i).getText());	
		}
		
	}

}


/*
Alternate way of doing this

import java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class A3 {



public static void main(String[] args) {



// TODO Auto-generated method stub







System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}
*/
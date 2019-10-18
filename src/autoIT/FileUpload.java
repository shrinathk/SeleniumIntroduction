package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pdf2jpg.net/");
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
		Thread.sleep(3000L);
		Runtime.getRuntime().exec("C:\\Users\\Neetu\\Documents\\fileUpload.exe");
	}

}

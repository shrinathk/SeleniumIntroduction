package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfpractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		
		
	}

}

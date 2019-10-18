import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Driver object for chrome browser
		
		/* Class name = ChromeDriver 
		 
		       X driver = new X();*/
		
		//invoke .exe file first
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neetu\\chromedriver.exe");
		
		driver.get("https://www.google.com/");
	}

}

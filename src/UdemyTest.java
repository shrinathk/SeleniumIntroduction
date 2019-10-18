import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neetu\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.udemy.com/selenium-real-time-examplesinterview-questions/learn/lecture/10822766#content");

	}

}

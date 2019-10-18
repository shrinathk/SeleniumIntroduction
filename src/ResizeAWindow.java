import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Dimension d = new Dimension(503, 150);
		driver.manage().window().setSize(d);
		int width = d.width;
		int height = d.height;
		for(int i = 0 ; ; i++) {
			driver.manage().window().setSize(new Dimension(width,height)); 
			width++;
			height++;
			if(i==10) {
				break;
			}
		}
		
	}

}

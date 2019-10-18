package subIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		// This is one way: 		ch.acceptInsecureCerts();
		
		// This is another way
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C://Users//Neetu//chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.cleartrip.com/");
	}

}

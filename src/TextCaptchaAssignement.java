import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextCaptchaAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neetu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String str = driver.findElement(By.id("mathq2")).getText();
		String[] split = str.split(" ");
		int val1 = Integer.parseInt(split[0]);
		String operand = split[1];
		int val2 = Integer.parseInt(split[2]);
		int result = 0;
		if(operand.equals("+")) {
			result = val1 + val2;
		}else if(operand.equals("-")) {
			result = val1 - val2;
		}else if(operand.equals("*")) {
			result = val1 - val2;
		}else if(operand.equals("/")) {
			result = val1 - val2;
		}
		
		driver.findElement(By.id("mathuserans2")).sendKeys(String.valueOf(result));
	}

}

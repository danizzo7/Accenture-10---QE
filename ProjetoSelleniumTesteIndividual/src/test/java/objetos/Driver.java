package objetos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	WebDriver driver;
	
	public WebDriver setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Documents\\Accenture QA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		return driver;
		

	}

}

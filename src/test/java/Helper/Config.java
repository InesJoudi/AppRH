package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {


	
	public static WebDriver driver;
	public static Actions actions;
	public static void ConfChrome () {
		
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
	}
	
	public static void maximize () {
		
		driver.manage().window().maximize();
	}
	
	public static void attents (int s)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	public static void close () {
		driver.quit();
	
		
	}

	
	
	
	
	
}

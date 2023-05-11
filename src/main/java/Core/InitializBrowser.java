package Core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializBrowser {

	
	public static void luanchBrowser(String url) {
		

	      WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	       
	        driver.get("https://tek-retail-ui.azurewebsites.net/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	      
		
		
		
		
		
		
		
		
		
	}
	
}

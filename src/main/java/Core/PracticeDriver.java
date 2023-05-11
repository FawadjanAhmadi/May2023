package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDriver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.amazon.com");
				
		drive.get("https://www.facebook.com");
		
		
		
		

	}

}

package LuanchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LuanchChromeBrowser {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
	//	WebDriverManager.firefoxdriver().setup();
WebDriver driver=new ChromeDriver();
//WebDriver driveEdge=new EdgeDriver();
//WebDriver driveFirefox=new FirefoxDriver();

//driveEdge.get("https://www.amazon.com");
//driveFirefox.get("https://tek-retail-ui.azurewebsites.net");
driver.navigate().to("https://www.amazon.com");

driver.navigate().refresh();


driver.navigate().to("https://www.facebook.com");



	}

}

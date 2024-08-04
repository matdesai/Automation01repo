package Driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverfact {
	 public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	
	public   WebDriver initBrowser(String browsername) {
		
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			
			tldriver.set(new ChromeDriver());
		}
		
		else if (browsername.contains("firefox")) {
			
			tldriver.set(new FirefoxDriver());
		}
		
		else if (browsername.contains("edge")) {
			
			tldriver.set(new EdgeDriver());
		}
		
		else if (browsername.contains("safari")) {
			
			tldriver.set(new SafariDriver());
		}
		
		return getdriver();
	}
	
	public static synchronized WebDriver getdriver() {
		
		return tldriver.get();
	}

}

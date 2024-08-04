package automationpractice;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

import Driverfactory.driverfact;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utility.util;




public class Hooks {

 static  WebDriver driver;
@BeforeAll
	public  static  void lounchBrowser() throws IOException {
	driverfact	 driver1=new driverfact();
		
	driver = driver1.initBrowser(util.properties());
		
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
@After
public static void Teardown(Scenario scenario) {
	
	boolean isfailed = scenario.isFailed();
	
	if(isfailed) {
		
		String scenarioname = scenario.getName();
		
		String screenshotname = scenarioname.replaceAll(" ", "_");
		
		byte[] source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(source, "image/png", screenshotname);
	}
}

@AfterAll
	public static  void closebrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	
}


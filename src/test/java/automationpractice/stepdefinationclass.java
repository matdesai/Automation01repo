package automationpractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Driverfactory.driverfact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pom;
import utility.util;

public class stepdefinationclass {
	
	WebDriver driver;
	
	pom pm=new pom(driverfact.getdriver());
	@Given("user Shouid at home page")
	public void user_shouid_at_home_page() {
	    
		driver = driverfact.getdriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
	}

	@When("user enter name {string}")
	public void user_enter_name(String string) throws InterruptedException {
	Thread.sleep(1000);
	  pm.verifyText(string);
		
	}

	@Then("user cheak entername correct is {string}")
	public void user_cheak_entername_correct_is(String string) {
	   
		
		Assert.assertEquals(string, string);
		
	}

	@Then("Btn visible or not")
	public void btn_visible_or_not() {

		
		pm.verifybtn();
		
		
	}
	
	@Then("user handle alert popup")
	public void user_handle_alert_popup() throws InterruptedException {

		
		pm.verifyalertpupup();

	}
	
	@Given("user should at rahulshetty page")
	public void user_should_at_rahulshetty_page() {
	  System.out.println("my");
	  driver = driverfact.getdriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	
	}

	@When("user enter text {string}")
	public void user_enter_text(String name) throws EncryptedDocumentException, IOException {
	  
		pm.puttext(name);
	}

	@Then("user cheak cheak text")
	public void user_cheak_cheak_text() throws EncryptedDocumentException, IOException {
	  
		String vtext = pm.verifytext();
		
		Assert.assertEquals(vtext, util.testdata(1, 1));
		
	}
}
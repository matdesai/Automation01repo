package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom {
	WebDriver driver;
	WebDriverWait wait;;
	JavascriptExecutor	js;
	@FindBy(xpath = "//b[text()='This is sample text!']")private WebElement scrolltext;
	@FindBy (xpath ="//input[@name='firstName']") private WebElement textbox;
	@FindBy (xpath ="//button[text()='Submit']") private WebElement Button;
	@FindBy(xpath="//button[@id='dblClkBtn']") private WebElement alert;
	@FindBy(xpath = "//input[@id='autocomplete']")private WebElement  text;
	@FindBy(xpath = "//select[@id='dropdown-class-example']")private WebElement dropdown;
	
	public pom(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		js=(JavascriptExecutor)driver;
		 wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	public void verifyText(String box) throws InterruptedException {
		
		
	
	
	js.executeScript("arguments[0].scrollIntoView(true)",scrolltext);
	textbox.click();
	
	//Thread.sleep(3000);
	textbox.click();
	wait.until(ExpectedConditions.visibilityOf(scrolltext));
		textbox.sendKeys(box);
		
		
	}
	
	public void verifybtn() {
		js.executeScript("arguments[0].scrollIntoView(true)",Button);
		wait.until(ExpectedConditions.visibilityOf(Button));
		
		Button.click();
		
	}
	
	public void verifyalertpupup() throws InterruptedException {
		
		js.executeScript("arguments[0].scrollIntoView(true)",Button);
		
		wait.until(ExpectedConditions.visibilityOf(Button));
Thread.sleep(3000);	
		
		Actions act =new Actions(driver);
		
		act.doubleClick();
		
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		
		al.accept();
	}
	
	public void puttext(String name) {
		
		text.sendKeys(name);
		
	}
	
	public String verifytext() {
		
		String str = text.getText();
		
		return str;
	}

}

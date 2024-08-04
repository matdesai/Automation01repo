package automationpractice;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Automationtestingfeature\\auto.feature"},
		glue = {"automationpractice"},
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		//,publish = true,
				
	     //,tags = "@functional"
		
		)




public class runnerclass extends AbstractTestNGCucumberTests{
//	@DataProvider(parallel = true)
//	
//	public Object[][] scenarios()
//	
//	{
//		return super.scenarios();
//		
//	}
}

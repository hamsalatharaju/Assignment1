package TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.AssBase;


public class RunnerClass extends AssBase{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void weather()
	{

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.navigate().to("https://www.msn.com/en-in/weather/today/bengalurukaindia/we-city?q=bengaluru-ka&form=PRWLAS&iso=IN&el=Yj9ytgACTbdbSjbzYmxrSg%3d%3d");

	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        Thread.sleep(6000);
	        
	        driver.findElement(By.xpath("//li[@id='fbcount']")).click();
	        
	        Thread.sleep(6000);
	        
	        
	       System.out.println(("clicked"));	        

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

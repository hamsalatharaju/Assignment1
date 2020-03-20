package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.MsnObj;

public class AssBase {

public static WebDriver driver = null;
public static MsnObj msn = null;
	
	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		msn = new MsnObj(driver);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}

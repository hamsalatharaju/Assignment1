package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MsnObj {

	

	public MsnObj(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	
//	@FindBy(xpath = "//li[@id='fbcount']")
//	public WebElement facebook;

}

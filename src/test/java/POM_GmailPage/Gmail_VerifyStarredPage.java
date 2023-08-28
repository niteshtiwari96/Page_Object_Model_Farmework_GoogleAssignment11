package POM_GmailPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.Configuration;

public class Gmail_VerifyStarredPage {

    WebDriver driver;
	
	public Gmail_VerifyStarredPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText=Configuration.starredSection)
	public WebElement myStarredSection;
	
	@FindBy(xpath=Configuration.mailstarred)
	public WebElement mymailstarred;
	
	public WebElement getStarredSection()
	{
		 return myStarredSection;
	}
	
	public WebElement getEmailstarred()
	{
		 return mymailstarred;
	}	
	
}

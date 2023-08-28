package POM_GmailTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Core.Test_CoreTest;
import POM_GmailPage.Gmail_VerifyStarredPage;
import POM_Util.testUtil;

public class TC_04_Gmail_VerifyStarredTest extends Test_CoreTest{
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("TC_04_Gmail_VerifyStarredTest"))
		{
			throw new SkipException("Skipping testcase as runmode is set to No");
		}
	}
	
	
	
	@Test
	public void doGmailStarredVerify() throws InterruptedException, IOException
	{
		try{
		Thread.sleep(6000);
		Gmail_VerifyStarredPage vSP=new Gmail_VerifyStarredPage(driver);
		app_logs.debug("Click on Starred Links");
		vSP.getStarredSection().click();
		Thread.sleep(6000);
		app_logs.debug("Get No of Starred Email");
		System.out.println("total no. of emails marked with STAR is :"+vSP.mymailstarred.getText());	
		
		}catch(Throwable t)
		{
			testUtil.captureScreenshot("TC_04_Gmail_VerifyStarredTest");
			Assert.assertTrue(false, t.getMessage());
		}
	}

}

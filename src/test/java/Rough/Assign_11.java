package Rough;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_11 {
	
	/*
	 * 11.  To verify the total no. of emails marked with STAR
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Gmail app
		driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		WebElement f=driver.findElement(By.name("app"));//name="app"
		driver.switchTo().frame(f);
		driver.findElement(By.partialLinkText("Gmai")).click();
		Thread.sleep(3000);
		
		WebElement sign=driver.findElement(By.linkText("Sign in"));
		sign.click();
		
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("nittiw63@gmail.com");
		
		WebElement userNextButton=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
		userNextButton.click();
		
		WebElement Password=driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		Password.sendKeys("blu3@T0p");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
		
		 Thread.sleep(2000);
		 WebElement starredSection=driver.findElement(By.linkText("Starred"));
		 starredSection.click();
			
		 
        /*//Locate and click on the "Starred" section
		Thread.sleep(2000);
        WebElement starredSection = driver.findElement(By.partialLinkText("Starred"));
        starredSection.click();*/
       
     
        Thread.sleep(5000);  
        WebElement emailstarred = driver.findElement(By.xpath("(//span[@class='ts'])[6]"));
        System.out.println("total no. of emails marked with STAR is :"+emailstarred.getText());

    }			  
}



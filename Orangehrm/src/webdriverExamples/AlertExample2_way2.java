package webdriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample2_way2 
{
	

	public static void main(String []args)throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	
	//maximize the browser
		Driver.manage().window().maximize();
		//open Application
		Driver.get("http://classroom:90/webapp/Ex2.html");
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/a"),"Click here to enter your name"  ));
		
		{
			System.out.println("0");
			System.out.println("home page displayed");
		}
		//click here to Enter name
		Driver.findElement(By.xpath("/html/body/a")).click();
		Alert A=wait.until(ExpectedConditions.alertIsPresent());
		if(A.getText().equals("Please enter your name."))
		{
			System.out.println("1");
			System.out.println("Alert1 displayed");
			A.sendKeys("Ramki");
			A.accept();
		}
		//verify enter name
		Driver.findElement(By.id("idName"));
		WebElement ObjName=Driver.findElement(By.id("idName"));
		if(ObjName.isDisplayed())
		{
			System.out.println("2");
			System.out.println("enter namedisplayed");
		}
		Driver.close();
		Driver.quit();
	}
}
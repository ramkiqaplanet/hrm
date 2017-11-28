package webdriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleAlertExa2 
{
	public static void main(String[]args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	
	//maximize the browser
		Driver.manage().window().maximize();

	//open Application
		Driver.get("http:classroom:90/webapp/Ex3.html");
	//wait objects
		WebDriverWait wait=new WebDriverWait(Driver, 60);
	//verify the Subject Button
	WebElement OjbSub=Driver.findElement(By.name("Submit"));
	if(OjbSub.isDisplayed());
	{
		System.out.println("home page displayed");
	}
	System.out.println("1");
	Driver.findElement(By.name("rdoPres")).click();
	OjbSub.click();
	System.out.println("2");
	//wait for alert1
	wait.until(ExpectedConditions.alertIsPresent());
	//Switch to Alert1
	System.out.println("3");
	Alert A=Driver.switchTo().alert();
	System.out.println(A.getText());
	if(A.getText().equals("Are you sure you want to submit this answer?"))
	{
		System.out.println(" Alert1 displayed");
		A.accept();
	Alert B=Driver.switchTo().alert();
	System.out.println("4");
	System.out.println(A.getText());
	if(A.getText().equals("submitted"))
		{
		System.out.println(" Alert2 displayed");
		B.accept();
		}
	}
	 Driver.close();
	 Driver.quit();
}
}
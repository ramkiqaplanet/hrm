package webdriverExamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class Tc1_MultipleAlertWay2
{
	public static void main(String[]args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	//maximize the browser
	Driver.manage().window().maximize();
	//open appliation 
	Driver.get("http:classroom:90/webapp/Ex3.html");
	WebDriverWait wait =new  WebDriverWait(Driver, 60);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//html/body/input[4]")));
	WebElement ObjSubmit=Driver.findElement(By.xpath("//html/body/input[5]"));
	ObjSubmit.click();
	System.out.println("0");
	System.out.println("home page displaced");
	//wait for Aler and switch to it
	Alert A=wait.until(ExpectedConditions.alertIsPresent());
	if(A.getText().equals("Are you sure you want to submit this answer?"))
	{
		System.out.println("1");
		System.out.println("Alert1 Displaced");
		A.accept();
		
	}
	
	Alert B= wait.until(ExpectedConditions.alertIsPresent());
	if(B.getText().equals("submitted"))
	{
		System.out.println("2");
		System.out.println("Alert2 Displaced");
		B.accept();
		
	}
	Driver.close();
	Driver.quit();
}
}
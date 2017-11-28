package webdriverExamples;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExaOfAlertMesssage 
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
	//wait for title
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body"), "Who was the first president of the United States?")))
	{
			System.out.println("home page displayed");
	}
	
	WebElement ObjSubmit=Driver.findElement(By.name("Submit"));
	if(ObjSubmit.isDisplayed())
		{
		System.out.println("home page displayed");
		}
	else
	{
		System.out.println("home page not displayed");
	}
		
	//select Ans Click and submit
		Driver.findElement(By.name("rdoPres")).click();
		ObjSubmit.click();
		
	//wait for alert
		wait.until(ExpectedConditions.alertIsPresent());
	//switch to alert
		Alert A=Driver.switchTo().alert();
	//verify confarmation message
	if(A.getText().equals("Are you sure you want to submit this answer"))
	{
		System.out.println("YES Alert1 displayed");
		A.accept();
	}
		Alert B=Driver.switchTo().alert();
	if(B.getText().equals("submitted"))
	{
		System.out.println("YES Alert2 displayed");
		B.accept();
	}
	
	
	

	Driver.close();
	Driver.quit();
	}
}

package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MouseOverWithVtiger 
{
	public static void main(String[]args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	//maximize the browser
	Driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(Driver, 20);
	String URL="http://classroom:8888/index.php?action=Login&module=Users";
	Driver.get(URL);
	if(wait.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM")))
	{
		System.out.println("1");
		System.out.println("login page is displced");
	}
	else
	{
		System.out.println("login page not displced");
	}
	WebElement ObjUN=Driver.findElement(By.name("user_name"));
	WebElement ObjPW=Driver.findElement(By.name("user_password"));
	WebElement ObjSub=Driver.findElement(By.id("submitButton"));
	ObjUN.clear();
	ObjUN.sendKeys("qaplanet1");
	ObjPW.clear();
	ObjPW.sendKeys("user1");
	ObjSub.click();
	if(wait.until(ExpectedConditions.titleContains("Home - vtiger CRM 5 - Commercial Open Source CRM")))
	{
	System.out.println("2");
	System.out.println("Home page displaced");
	}
	else
	{
		System.out.println("Home page not displaced");
	}
	Actions A=new Actions(Driver);
	WebElement More=Driver.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[22]/a"));
	A.moveToElement(More).perform();
	Driver.findElement(By.id("more")).click();
	if(wait.until(ExpectedConditions.titleContains("user1 - SMSNotifier - vtiger CRM 5 - Commercial Open Source CRM")))
	{
		System.out.println("3");
		System.out.println("Sms page displaced");
	}
	else
	{
		System.out.println("Sms page is not displced");
	}
	WebElement User=Driver.findElement(By.xpath("//html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
	A.moveToElement(User).perform();
	Driver.findElement(By.linkText("Sign Out")).click();
	System.out.println("SinoutSucces");
	Thread.sleep(2000);
	Driver.close();
	Driver.quit();
	
}
}
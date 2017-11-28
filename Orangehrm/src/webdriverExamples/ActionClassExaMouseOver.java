package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClassExaMouseOver 
{
	public static void main(String []args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("http://apps.qaplanet.in/qahrm/index.php");
	//WebDriverWait wait =new WebDriverWait(Driver, 2);
	Thread.sleep(2000);
	WebElement ObjUN=Driver.findElement(By.name("txtUserName"));
	WebElement ObjPW=Driver.findElement(By.name("txtPassword"));
	WebElement ObjSub=Driver.findElement(By.name("Submit"));
	ObjUN.clear();
	ObjUN.sendKeys("qaplanet1");
	ObjPW.clear();
	ObjPW.sendKeys("user1");
	ObjSub.click();
	System.out.println("Step1 Succes");
	Thread.sleep(2000);
	if(Driver.getTitle().equals("OrangeHRM"));
	{
		System.out.println("Home page is Displaced");
	}
	Actions A=new Actions(Driver);
	WebElement PIM=Driver.findElement(By.id("pim"));
	A.moveToElement(PIM).perform();
	Driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(2000);
	if(Driver.getTitle().equals("OrangeHRM"));
	{
		System.out.println("AddEmployee Page Displaced");
		System.out.println("Step2 Succes");
	}
	
	Driver.findElement(By.linkText("Logout"));
	Thread.sleep(2000);
	Driver.close();
	Driver.quit();
	
	}
}
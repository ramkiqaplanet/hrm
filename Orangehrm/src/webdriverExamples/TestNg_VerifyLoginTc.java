package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
public class TestNg_VerifyLoginTc 
{
WebDriver Brow;
WebDriverWait wait;
@BeforeClass
public void Setup()
{
System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
Brow=new ChromeDriver();
wait=new WebDriverWait(Brow, 30);
Brow.manage().window().maximize();
}
@AfterClass
public void Shutdown()
{
	Brow.close();
	Brow.quit();
}

@Test
public void verifyOrangeHrmpage()
{
	Brow.get("http://classroom:90/qahrm/login.php");
	wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management"));
	//verify home page
	if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
	{
		System.out.println("home page displaced");
	}
	//crreate object for UN,PW
	WebElement ObjUN=Brow.findElement(By.name("txtUserName"));
	WebElement ObjPW=Brow.findElement(By.name("txtPassword"));
	if(ObjUN.isDisplayed()&&(ObjPW.isDisplayed()))
	{
		Reporter.log("UN and PW exists");
	}
	String username="qapplanet1";
	ObjUN.sendKeys("username");
	ObjPW.sendKeys("user1");
	Brow.findElement(By.name("Submit")).click();
//verify home page
wait.until(ExpectedConditions.titleContains("OrangeHRM"));
if(Brow.getTitle().equals("OrangeHRM"))
{
	Reporter.log("OrangeHRM page displaced");
}
//verify welcome,logout
String welcme=Brow.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
if(welcme.equals("welcome" +username))
{
	Reporter.log("welcome +username displaced");
}
/*
WebElement Log=Brow.findElement(By.linkText("Logout"));
WebElement Cp=Brow.findElement(By.linkText("Logout"));
if(Log.isDisplayed()&&(Cp.isDisplayed()))
{
	Reporter.log("logout and changepasword displaced ");
}
*/
//click on logot
Brow.findElement(By.linkText("Logout")).click();
wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management"));
if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
{
	Reporter.log("Signoff sucessfull and home page displayed");
}

}


































}

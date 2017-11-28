package maven;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExaMav21 {
	WebDriver Brow;
	WebDriverWait Wait;

	@AfterClass 
	public void close()
	{
		Brow.close();
		Brow.quit();
		
	}
	@BeforeClass
	public void Setup()
	{	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		Brow=new ChromeDriver();
		Wait=new WebDriverWait(Brow, 30);
		Brow.manage().window().maximize();
		System.out.println("rk.purna");
	}
	@Test
	public void Login()
	{
		Brow.get("http://apps.qaplanet.in/qahrm/login.php");
		Wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		assertEquals(Brow.getTitle(), "OrangeHRM - New Level of HR Management");
		Reporter.log("OrangeHRM page displayed");
		Brow.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Brow.findElement(By.name("txtPassword")).sendKeys("lab1");
		Brow.findElement(By.name("Submit")).click();
	}	
	@Test(priority=2)
	public void AddEmp()
	{
		Actions A=new Actions(Brow);
		WebElement ObjAd= Brow.findElement(By.id("pim"));
		A.moveToElement(ObjAd).build().perform();
		Brow.findElement(By.linkText("Add Employee")).click();
	}
}

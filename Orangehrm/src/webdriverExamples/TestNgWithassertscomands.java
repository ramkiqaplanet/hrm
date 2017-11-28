package webdriverExamples;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TestNgWithassertscomands
{
	WebDriver Brow;
	WebDriverWait wait;
@BeforeClass	
public void Config()
{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	Brow=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(Brow, 30);
	Brow.manage().window().maximize();
}
@AfterClass
public void SuttDown()
{
	Brow.close();
	Brow.quit();
}
@Test
public void verifyOrangeHrmPage()
{
Brow.get("http://classroom:90/qahrm/index.php");
wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management"));
assertEquals(Brow.getTitle(), "OrangeHRM - New Level of HR Management");
Reporter.log("home page displayed");

WebElement ObUN=Brow.findElement(By.name("txtUserName"));
WebElement ObPW=Brow.findElement(By.name("txtPassword"));
WebElement ObLB=Brow.findElement(By.name("Submit"));
WebElement ObCL=Brow.findElement(By.name("clear"));
assertTrue(ObUN.isDisplayed()&&(ObPW.isDisplayed()));
Reporter.log("username and password displayed");
assertTrue(ObCL.isDisplayed()&&(ObCL.isDisplayed()));
Reporter.log("submit and clear btns displayed");
String sUN="qaplanet1";
String sPW="user1";
ObUN.clear();
ObUN.sendKeys("sUN");
ObPW.clear();
ObPW.sendKeys("sPW");
ObLB.click();
wait.until(ExpectedConditions.titleContains("OrangeHRM"));
assertEquals(Brow.getTitle(), "OrangeHRM");
Reporter.log("OrangeHRM page displyed");
String Wcm=Brow.findElement(By.xpath("//html/body/div[3]/ul/li[1]")).getText();
assertEquals(Wcm, "Welcome" +sUN);
Reporter.log("      ");
WebElement CP=Brow.findElement(By.linkText("Change Password"));
WebElement LG=Brow.findElement(By.linkText("Logout"));
assertTrue(CP.isDisplayed()&&(LG.isDisplayed()));
Reporter.log("changepassword and logout displayed");
//click on logout
LG.click();
wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management"));
assertEquals(Brow.getTitle(), "OrangeHRM - New Level of HR Management");
Reporter.log("Signoff sucessfully home page displayed");
}
}
























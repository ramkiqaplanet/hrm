package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassExDragAndDrop 
{
	public static void main(String []args) throws Exception
	{
	System.setProperty("webdriver.gecko.driver","D:\\tet\\Selenium_Demp\\geckodriver-v0.16.1-win32\\geckodriver.exe");
	FirefoxDriver Driver=new FirefoxDriver();
	Driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(Driver,20);
	Driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
	Thread.sleep(2000);
	System.out.println("Step1 Succes'");
	Actions A=new Actions(Driver);
	WebElement From= (WebElement) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[2]/table/tbody/tr/td[4]/span")));
	WebElement To=(WebElement) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr[1]/td[4]/span")));
	A.dragAndDrop(From, To).build().perform();
	Thread.sleep(2000);
	System.out.println("Step2 Succes");
	Driver.close();
	Driver.quit();
	
	}
}
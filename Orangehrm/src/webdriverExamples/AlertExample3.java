package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class AlertExample3 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	//maximize the browser
	Driver.manage().window().maximize();
	//open appliation 
	Driver.get("http://classroom:90/webapp/UserInputForm.html");
	WebDriverWait wait =new  WebDriverWait(Driver, 60);
	WebElement ObjSub=Driver.findElement(By.xpath("//html/body/form/table/tbody/tr[5]/td/input[2]"));
	WebElement ObjUpdate=Driver.findElement(By.xpath("//html/body/form/table/tbody/tr[5]/td/input[1]"));
	if(ObjSub.isDisplayed())	
	 {
		System.out.println("0");
		System.out.println("home page displased");
		ObjUpdate.click();
		Driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("ram");
		Driver.findElement(By.xpath("//html/body/form/table/tbody/tr[3]/td[2]/input")).sendKeys("ram");
		ObjSub.click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("1");
		Alert A=Driver.switchTo().alert();
		if(A.getText().equals("@ is not found"))
	{
			System.out.println("1");
			System.out.println("alert1 is displaced");
			A.accept();
	}
	 }
	Driver.close();
	Driver.quit();
}
}
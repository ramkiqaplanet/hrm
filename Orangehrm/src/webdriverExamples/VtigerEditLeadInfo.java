package webdriverExamples;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	

public class VtigerEditLeadInfo 
{

		public static void main(String[]args) throws Exception
		{
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//maximize the browser
		Driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(Driver, 60);
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
		//verify all fileds
		WebElement ObjCal=Driver.findElement(By.linkText("Calendar"));
		if(ObjCal.isDisplayed())
		{
			System.out.println("Calendar displaced");
		}
		WebElement ObjLeads=Driver.findElement(By.linkText("Leads"));
		if(ObjLeads.isDisplayed())
		{
			System.out.println("center displaced");
		}
		WebElement ObjOrg=Driver.findElement(By.linkText("Organizations"));
		if(ObjOrg.isDisplayed())
		{
			System.out.println("Organizations displaced");
		}
		WebElement ObjCont=Driver.findElement(By.linkText("Contacts"));
		if(ObjCont.isDisplayed())
		{
			System.out.println("Contacts displaced");
		}
		WebElement ObjOpert=Driver.findElement(By.linkText("Opportunities"));
		if(ObjOpert.isDisplayed())
		{
			System.out.println("Opportunities displaced");
		}
		WebElement ObjProd=Driver.findElement(By.linkText("Products"));
		if(ObjProd.isDisplayed())
		{
			System.out.println("Products displaced");
		}
		WebElement ObjDoc=Driver.findElement(By.linkText("Documents"));
		if(ObjDoc.isDisplayed())
		{
			System.out.println("Documents displaced");
		}
		WebElement ObjEmail=Driver.findElement(By.linkText("Email"));
		if(ObjEmail.isDisplayed())
		{
			System.out.println("Email displaced");
		}
		
		WebElement ObjTickets=Driver.findElement(By.linkText("Trouble Tickets"));
		if(ObjTickets.isDisplayed())
		{
			System.out.println("Documents displaced");
		}
		WebElement ObjDashboard=Driver.findElement(By.linkText("Dashboard"));
		if(ObjDashboard.isDisplayed())
		{
			System.out.println("Dashboard displaced");
		}
		//Verify lead module page
		ObjLeads.click();
		if(wait.until(ExpectedConditions.titleContains("user1 - Leads - vtiger CRM 5 - Commercial Open Source CRM")));
		{
		System.out.println("Lead module page displaced");
		}
		Driver.findElement(By.xpath("//html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		//verify create new leadpage 
		boolean Leadres=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Lead"));
		if(Leadres)
		{
			System.out.println("create new leadpage displaced");
		}
		String sLN="ramki";
		String sCN="rkcompany";

		//popup msg Last Name cannot be empty

		WebElement Obsav=Driver.findElement(By.name("button"));
		Obsav.click();
		Alert A1=wait.until(ExpectedConditions.alertIsPresent());
		if(A1.getText().equals("Last Name cannot be empty"));
		{
		System.out.println("Last Name cannot be empty pop up displaced");
		}
		A1.accept();
		//Enter last name and verify popup msg Company cannot be empty
		Driver.findElement(By.id("lastname")).sendKeys("sLN");
		Obsav.click();
		Alert A2=wait.until(ExpectedConditions.alertIsPresent());
		if(A2.getText().equals("Company cannot be empty"));
		{
			System.out.println("Company cannot be empty pop up displaced");
		}
		A2.accept();
		//Enter Comp name and verify lead info page
		Driver.findElement(By.id("company")).sendKeys("sCN");
		Obsav.click();
		if(Driver.findElement(By.xpath("//html/body/table[3]/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/div/table[2]/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td")).getText().equals("Lead Information"))
		{
			System.out.println("lead info page displayed");	
		}
		//verify leadmodule page
		WebElement Lead=Driver.findElement(By.linkText("Leads"));
		Lead.click();
		Driver.switchTo().parentFrame();
		if(Driver.findElement(By.xpath("//html/body/table[3]/tbody/tr[2]/td[1]/a")).getText().equals("Leads"));
		{
			System.out.println(" leadmodule page displaced");
		}
		//click on logout
		Driver.switchTo().defaultContent();
		WebElement User=Driver.findElement(By.xpath("//html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
		Actions A=new Actions(Driver);
		A.moveToElement(User).build().perform();
		Driver.findElement(By.linkText("Sign Out")).click();
		Driver.close();
		Driver.quit();
}
}

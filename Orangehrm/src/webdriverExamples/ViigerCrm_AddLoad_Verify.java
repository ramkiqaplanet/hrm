package webdriverExamples;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import com.sun.org.apache.bcel.internal.ExceptionConstants;

	public class ViigerCrm_AddLoad_Verify 
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
		//click on logout
		WebElement User=Driver.findElement(By.xpath("//html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
		Actions A=new Actions(Driver);
		A.moveToElement(User).build().perform();
		Driver.findElement(By.linkText("Sign Out")).click();
		if(wait.until(ExpectedConditions.titleContains("vtiger CRM 5 - Commercial Open Source CRM")));
		{
		System.out.println("home page displaced");
		}
		
		}}
		

	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

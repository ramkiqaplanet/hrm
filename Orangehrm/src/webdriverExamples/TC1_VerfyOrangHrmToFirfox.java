package webdriverExamples;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.*;
	public class TC1_VerfyOrangHrmToFirfox 
	{
		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.gecko.driver","D:\\tet\\Selenium_Demp\\geckodriver-v0.16.1-win32\\geckodriver.exe");
			FirefoxDriver Driver=new FirefoxDriver();
			
			//maximize the browser
			Driver.manage().window();
			
			//open Application
			Driver.get("http://apps.qaplanet.in/qahrm/login.php");
			//wait for 2sec
			Thread.sleep(2000);
			//verify title
			if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
			{
				System.out.println("Home page displayed");
			}
			else
			{
				System.out.println("Failed Home page displayed");
			}
			
			//create Webelement
			WebElement ObjUN=Driver.findElement(By.name("txtUserName"));
			WebElement ObjPW=Driver.findElement(By.name("txtPassword"));
			WebElement ObjLogin=Driver.findElement(By.name("Submit"));
			WebElement ObjClr=Driver.findElement(By.name("clear"));
			
			//verify usserloginname
			if(ObjUN.isDisplayed())
			{
				System.out.println("user loginname is displayed");
			}
			
			//verify usserloginpassword
			if(ObjPW.isDisplayed())
		
			{
				System.out.println("user password is displayed");
			}
			
			//verify the login and clear buttons
			if(ObjLogin.isDisplayed())
			{
				System.out.println(" login button is displayed");
			}
			if(ObjClr.isDisplayed())
			{
				System.out.println("clear button is displayed");
			}
			 String sUN ="qaplanet1";
			 String sPW="user1";
			 
			//login to Orangehrm
			 ObjUN.clear();
			 ObjUN.sendKeys(sUN);
			 ObjPW.clear();
			 ObjPW.sendKeys(sPW);
			 ObjLogin.click();
			 
			 //wait for 2sec
			 Thread.sleep(2000);
			 
			 //verify orangehrmpage
			 if(Driver.getTitle().equals("OrangeHRM"))
			 {
				 System.out.println("OrangeHRM page displayed"); 
			 }
			 
			 else
			 {
				 System.out.println("Failed OrangeHRM page displayed");
			 }
			 Thread.sleep(2000);
			//getwelcome test
			 String sWelcme = Driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
			 
			 //verifywelcomeqaplanet
			 if(sWelcme.equals("Welcome "+sUN))
			 {
				 System.out.println("Welcome qaplanet displayed");
			 }
			 //create webelement for changepasword and logout
			 WebElement ObjChgP=Driver.findElement(By.xpath("//html/body/div[3]/ul/li[1]"));
			 WebElement ObjLogout=Driver.findElement(By.xpath("//html/body/div[3]/ul/li[3]/a"));
			 //verify changepasword and logout
			 if(ObjChgP.isDisplayed()&& ObjLogout.isDisplayed())
			 {
				 System.out.println(" changepasword and logout are displayed");
			 }
			 
			//click on logout
			 ObjLogout.click();
			 
			 //wait for 2sec
			 Thread.sleep(2000);
			 //verify home page
			 if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
				{
					System.out.println("Home page displayed signoff suceseful");
				}
			 else
			 {
				 System.out.println("Failed Home page displayed signoff Unsuceseful");
			 }
			 //Driver.close();
			 //Driver.quit();
		}
	}


package webdriverExamples;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Tc_7_EditLocation 
	{
	public static void main(String[] args) throws Exception
	{
	

	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver =new ChromeDriver();
	Driver.manage().window().maximize();
	//open applications
	WebDriverWait wait= new WebDriverWait(Driver, 60);
	Driver.get("http://apps.qaplanet.in/qahrm/login.php");
	boolean res=wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
	if(res)
	{
		System.out.println("home page dissplaced");
	}
	else
	{
		System.out.println("home is not dissplaced");
	}
	//verify username,password,login and clear
	//create webElement for username,password,login and clear
	WebElement ObjUN=Driver.findElement(By.name("txtUserName"));
	WebElement ObjPW=Driver.findElement(By.name("txtPassword"));
	WebElement ObjLogin=Driver.findElement(By.name("Submit"));
	WebElement ObjClear=Driver.findElement(By.name("clear"));
	System.out.println("S.NO1 Completed");
	String sUN="qaplanet1";
	String sPW="user1";
	ObjUN.clear();
	ObjUN.sendKeys("qaplanet1");
	ObjPW.clear();
	ObjPW.sendKeys("user1");
	ObjLogin.click();
	if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
	{
		System.out.println("OrangeHRM page is displaced");
	}
	else
	{
		System.out.println("login page is not displaced");
	}
	System.out.println("0");
	//way1
	//wait and verify welcomeqaplanet text
	boolean blnWlctstres=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='option-menu']/li[1]"), "Welcome qaplanet1"));
	if(blnWlctstres)
	{
		System.out.println("Welcome qaplanet1 is displaced");
		System.out.println("1");
	}

	WebElement ObjPC=Driver.findElement(By.linkText("Change Password"));
	if(ObjPC.isDisplayed())
	{
		System.out.println("Change Password button is displced");
	}
	WebElement Objlogout=Driver.findElement(By.linkText("Logout"));
	if(Objlogout.isDisplayed())
	{
		System.out.println("Logout is button is displced");
	}
	System.out.println("S.NO2 Completed");
	//--------------------------------------------------------------
	//focous on addmin
	//mouse over
	Actions A=new Actions(Driver);
	WebElement Admin=Driver.findElement(By.id("admin"));
	A.moveToElement(Admin).build().perform();
	WebElement Company=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a/span"));
	A.moveToElement(Company).build().perform();
	WebElement Job=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/a/span"));
	A.moveToElement(Job).build().perform();
	WebElement Qualif=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[3]/a/span"));
	A.moveToElement(Qualif).build().perform();
	WebElement Skills=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[4]/a/span"));
	A.moveToElement(Skills).build().perform();
	WebElement Memory=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[5]/a/span"));
	A.moveToElement(Memory).build().perform();
	WebElement Nation=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[6]/a/span"));
	A.moveToElement(Nation).build().perform();
	WebElement Users=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[7]/a/span"));
	A.moveToElement(Users).build().perform();
	WebElement EmailNF=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[8]/a/span"));
	A.moveToElement(EmailNF).build().perform();
	WebElement ProjectInf=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[9]/a/span"));
	A.moveToElement(ProjectInf).build().perform();
	WebElement DataInfo=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[10]/a/span"));
	A.moveToElement(DataInfo).build().perform();
	WebElement CustFlds=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[11]/a/span"));
	A.moveToElement(CustFlds).build().perform();
	System.out.println("S.NO3 Completed");
	Thread.sleep(2000);
	//-------------------------------------------------------------------
	//focous on companyinfo
	WebElement ComInfo=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a/span"));
	A.moveToElement(ComInfo).build().perform();
	WebElement Gnrl=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[1]/a/span"));
	A.moveToElement(Gnrl).build().perform();
	WebElement Locat=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
	A.moveToElement(Locat).build().perform();
	WebElement Comp=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
	A.moveToElement(Comp).build().perform();
	WebElement CompnyPrp=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
	A.moveToElement(CompnyPrp).build().perform();
	Locat.click();
	System.out.println("S.NO4 Completed");
	//wait and verify forCompany Info
	boolean bolCompInfores= wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/div[1]/div[2]/form/div[1]/h2"),"Company Info : Locations"));
	if(bolCompInfores)
	{
		System.out.println("way0");
		System.out.println("Company Info : Locations is displaced");
		System.out.println("way0");
	}
	WebElement ObjSearchby=Driver.findElement(By.id("loc_code"));
	WebElement ObjSearchfor=Driver.findElement(By.id("top-menu"));
	WebElement ObjSearch=Driver.findElement(By.linkText("button"));
	if(ObjSearch.isDisplayed())
	{
		System.out.println("search button is displaced");
	}
	WebElement ObjReset=Driver.findElement(By.id("top-menu"));
	if(ObjReset.isDisplayed())
	{
		System.out.println("Reset button is displaced");
	}
	WebElement ObjAdd=Driver.findElement(By.id("top-menu"));
	if(ObjAdd.isDisplayed())
	{
		System.out.println("Add button is displaced");
	}
	WebElement ObjDelate=Driver.findElement(By.id("top-menu"));
	if(ObjDelate.isDisplayed())
	{
		System.out.println("delate button is desplaced");
		System.out.println("S.NO5 Completed");
	}
	//click on add 
	ObjAdd.click();
	//wait for switch to frame
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
	//wait and verify Company Info : Locations
	boolean bolCompLocres=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/div[1]/div[3]/div[2]/div/h2"),"Company Info : Locations"));
	if(bolCompLocres)
	{
		System.out.println("verify Company Info : Locations is displaced");
		System.out.println("way1 for verify Company Info ");
	}
	//way2
	if(Driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[2]/div/h2")).equals("Company Info : Locations"))
	{
		System.out.println("verify Company Info : Locations is displaced");
		Thread.sleep(2000);
		System.out.println("way2 for verify Company Info");
		}
	WebElement ObjName=Driver.findElement(By.id("txtLocDescription"));
	if(ObjName.isDisplayed())
	{
		System.out.println("Name displaced");
	}
	WebElement objCountry=Driver.findElement(By.id("cmbCountry"));
	if(objCountry.isDisplayed())
	{
		System.out.println("Country displaced");
	}
	WebElement ObjState=Driver.findElement(By.id("txtState"));
	if(ObjState.isDisplayed())
	{
		System.out.println("state displaced");
	}
	WebElement ObjCity=Driver.findElement(By.id("cmbDistrict"));
	if(ObjCity.isDisplayed())
	{
		System.out.println("city displaced");
	}
	WebElement ObjAddres=Driver.findElement(By.id("txtAddress"));
	if(ObjAddres.isDisplayed())
	{
		System.out.println("Address displaced");
	}
	WebElement ObjZipcode=Driver.findElement(By.id("ObjAddres"));
	if(ObjZipcode.isDisplayed())
	{
		System.out.println("zip code displaced");
	}
	WebElement ObjPhone=Driver.findElement(By.id("txtPhone"));
	if(ObjPhone.isDisplayed())
	{
		System.out.println("phonee displaced");
	}
	WebElement ObjFox=Driver.findElement(By.id("txtFax"));
	if(ObjFox.isDisplayed())
	{
		System.out.println("fox displaced");
	}
	WebElement ObjComments=Driver.findElement(By.id("txtComments"));
	if(ObjComments.isDisplayed())
	{
		System.out.println("comments displaced");
		System.out.println("S.NO6 Completed");
	}
	WebElement ObjSave=Driver.findElement(By.id("editBtn"));
	ObjSave.click();
	Alert A1=wait.until(ExpectedConditions.alertIsPresent());
	A1.getText().equals("Please correct the following- Location Name has to be specified- Country should be selected!- Address should be specified- Zip Code should be specified");
	A1.accept();
	System.out.println("S.NO7 Completed");
	Thread.sleep(2000);
	ObjName.sendKeys("Ramki");
	ObjSave.click();
	Alert A2=wait.until(ExpectedConditions.alertIsPresent());
	A2.getText().equals("Please correct the following- Country should be selected!- Address should be specified- Zip Code should be specified");
	A2.accept();
	Select sel=new Select(objCountry);
	sel.selectByVisibleText("Hong Kong");
	ObjSave.click();
	Alert A3=wait.until(ExpectedConditions.alertIsPresent());
	A3.getText().equals("Please correct the following- Address should be specified- Zip Code should be specified");
	A3.accept();
	ObjAddres.sendKeys("qaplanet1 SrNagar");
	ObjSave.click();
	Alert A4=wait.until(ExpectedConditions.alertIsPresent());
	A4.getText().equals("Please correct the following- Zip Code should be specified");
	A4.accept();
	ObjZipcode.sendKeys("967656");
	ObjSave.click();
	boolean bolCompLocres2= wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2"), "Company Info : Locations"));
	if(bolCompLocres2)
	{
		System.out.println("verify Company Info : Locations is displaced");
	}
	else
	{
		System.out.println(" failed to Company Info");
		System.out.println("S.NO11 Completed");
	}
//veri lacation table
	int rc=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td")).size();
	//Get second column data
	for(int i=0;i<=rc;i++){
	String names=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]")).getText();
	if(names.equals("Ramki")){
	Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/t d[3]")).click();
	break;
	}}
	//Edit Location
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
	WebElement ObjEdit= Driver.findElement(By.id("btnEditPers"));
	WebElement Objsave= Driver.findElement(By.id("btnEditPers"));
	WebElement CityName=Driver.findElement(By.id("cmbDistrict"));
	ObjEdit.click();
	CityName.clear();
	CityName.sendKeys("hyderabad");
	Objsave.click();
	
	//Delate Location
	Driver.switchTo().parentFrame();
	Driver.findElement(By.name("chkLocID[]")).click();
	Driver.findElement(By.linkText("button")).click();
	
	//Delate multiple Location
	//click on logout
	Driver.switchTo().defaultContent();
	Objlogout.click();
	Thread.sleep(2000);
	Driver.switchTo().defaultContent();
	Driver.close();
	Driver.quit();
	
	}
	}


























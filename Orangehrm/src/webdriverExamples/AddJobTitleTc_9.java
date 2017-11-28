package webdriverExamples;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	public class AddJobTitleTc_9 
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
		//focous on job
		WebElement Job1=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/a/span"));
		A.moveToElement(Job1).build().perform();
		WebElement JobTitle=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/ul/li[1]/a/span"));
		A.moveToElement(JobTitle).build().perform();
		WebElement JobSpcf=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/ul/li[2]/a/span"));
		A.moveToElement(JobSpcf).build().perform();
		WebElement PayGrades=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/ul/li[4]/a/span"));
		A.moveToElement(PayGrades).build().perform();
		WebElement EmpST=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/ul/li[4]/a/span"));
		A.moveToElement(EmpST).build().perform();
		WebElement EEoJob=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/ul/li[5]/a/span"));
		A.moveToElement(EEoJob).build().perform();
		//click on jobtitle
		JobTitle.click();
		//verify Jobtitle page
		boolean bolCompInfores= wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/div[1]/div[2]/form/div[1]/h2"),"Job : Job Title"));
		if(bolCompInfores)
		{
			System.out.println("Job : Job Title is verifiyed");
		}
		
		WebElement ObjSearchby=Driver.findElement(By.id("loc_code"));
		if(ObjSearchby.isDisplayed())
		{
			System.out.println("search by displaced");
		}
		WebElement ObjSearchfor=Driver.findElement(By.id("top-menu"));
		if(ObjSearchfor.isDisplayed())
		{
			System.out.println("Searchfor displaced");
		}
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
			
		}
		//click on addbtn
		ObjAdd.click();
		boolean boljobtres=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/div[1]/div[2]/form/div[1]/h2"),"Job : Job Title" ));
		if(boljobtres)
		{
			System.out.println("Job Job Title displaced");
		}
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
		WebElement ObjSave=Driver.findElement(By.linkText("button"));
		WebElement Title=Driver.findElement(By.name("txtJobTitleName"));
		WebElement Descr=Driver.findElement(By.name("txtJobTitleDesc"));
		ObjSave.click();
		Alert A1=wait.until(ExpectedConditions.alertIsPresent());
		A1.getText().equals("Job Title Name should be specified");
		A1.accept();
		
		Title.clear();
		Title.sendKeys("Softwatr");
		Alert A2=wait.until(ExpectedConditions.alertIsPresent());
		A2.getText().equals("Job Description should be specified");
		A2.accept();
		Descr.clear();
		Descr.sendKeys("Testing");
		ObjSave.click();
		//verify Empolyelyment status
		WebElement Emp=Driver.findElement(By.id("cmbAssEmploymentStatus"));
		
		if(Emp.isDisplayed())
		{
			System.out.println("Empolyelyment status filed displaced");
		}
		
		WebElement Edit=Driver.findElement(By.id("editBtn"));
		Edit.click();
		WebElement Employe=Driver.findElement(By.id("cmbAssEmploymentStatus"));
		Employe.click();
		ObjSave.click();
		//verify newlyadded table
		Driver.switchTo().parentFrame();
		int rc=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td")).size();
		for(int i=0; i<=rc; i++)
		{
	String Name=Driver.findElement(By.xpath("//table[@class='datatable']/tbody/tr["+i+"/td[3]")).getText();
		
	if(Name.equals("Testing"))
	{
		Driver.findElement(By.xpath("//table[@class='datatable']/tbody/tr["+i+"/td[3]")).click();
		break;
	}
		}
	//Edit
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
	Edit.click();
	WebElement Com=Driver.findElement(By.name("txtJobTitleName"));
	Com.clear();
	Com.sendKeys("super");
	ObjSave.click();
	System.out.println("Successfully Updated");
	//delate
	Driver.switchTo().parentFrame();
	Driver.findElement(By.name("chkLocID[]"));
	Driver.findElement(By.linkText("button")).click();
	Alert A3=wait.until(ExpectedConditions.alertIsPresent());
	A3.getText().equals("Deletion may affect Pay Grade of Employees in PIM. Do you want to delete ?");
	A3.accept();
	System.out.println("Successfully Deleted");
	//add jobspecification
	ObjAdd.click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
	WebElement select=Driver.findElement(By.name("cmbJobSpecId"));
	Select s= new Select(select);
	s.selectByVisibleText("Tester Engineer");
	ObjSave.click();
	//verify add jobspecification table
	Driver.switchTo().parentFrame();
	int rc1=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td")).size();
	for(int i=0; i<=rc1; i++)
	{
String Name=Driver.findElement(By.xpath("//table[@class='datatable']/tbody/tr["+i+"/td[3]")).getText();
	
if(Name.equals("Testing"))
{
	Driver.findElement(By.xpath("//table[@class='datatable']/tbody/tr["+i+"/td[3]")).click();
	break;
}
	}
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));

	//Edit JobSp
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
	WebElement ObjSave1=Driver.findElement(By.linkText("button"));
	WebElement Title1=Driver.findElement(By.name("txtJobTitleName"));
	WebElement Descr1=Driver.findElement(By.name("txtJobTitleDesc"));
	ObjSave.click();
	Edit.click();
	WebElement Des=Driver.findElement(By.name("txtJobTitleName"));
	Des.clear();
	Des.sendKeys("super");
	ObjSave.click();
	//DelatejobSp
	Driver.switchTo().parentFrame();
	Driver.findElement(By.name("chkLocID[]"));
	Driver.findElement(By.linkText("button")).click();
	Alert A6=wait.until(ExpectedConditions.alertIsPresent());
	A6.getText().equals("Job Title Name should be specified");
	A6.accept();
	//addQulification
	
	/*
	WebElement Title2=Driver.findElement(By.name("txtJobTitleName"));
	WebElement Descr2=Driver.findElement(By.name("txtJobTitleDesc"));
	Alert A4=wait.until(ExpectedConditions.alertIsPresent());
	A4.getText().equals("Job Title Name should be specified");
	A4.accept();
	Title2.clear();
	Title2.sendKeys("Softwatr");
	ObjSave.click();
	Alert A5=wait.until(ExpectedConditions.alertIsPresent());
	A5.getText().equals("Job Title Name should be specified");
	A5.accept();
	
	
	Title.clear();
	Title.sendKeys("Softwatr");
	Alert A2=wait.until(ExpectedConditions.alertIsPresent());
	A2.getText().equals("Job Description should be specified");
	A2.accept();
	*/
	}}
	
	
	
	
	
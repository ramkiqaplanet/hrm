package webdriverExamples;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.Alert;
	public class AddEmployeVerfyEmpTc_2345 
	{
	public static void main(String[] args) 
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
			System.out.println("home page displaced");
		}
		else
		{
			System.out.println("home page displaced not displaced");
		}
		//create WebElement
		WebElement ObjUN=Driver.findElement(By.name("txtUserName"));
		WebElement ObjPW=Driver.findElement(By.name("txtPassword"));
		WebElement ObjLOgin=Driver.findElement(By.name("Submit"));
		WebElement ObjClear=Driver.findElement(By.name("clear"));
		//verify UN,PW,Login and Clear
		if(ObjUN.isDisplayed())
		{
			System.out.println("username is displaced");
		}
		if(ObjPW.isDisplayed())
		{
			System.out.println("password is displaced");
		}
		if(ObjLOgin.isDisplayed())
		{
			System.out.println("login button is displaced");
		}
		if(ObjClear.isDisplayed())
		{
			System.out.println("clear button is displaced");
		}
		String sUN="qaplanet1";
		String sPW="user1";
		//click on login
		ObjUN.clear();
		ObjUN.sendKeys(sUN);
		ObjPW.clear();
		ObjPW.sendKeys(sPW);
		ObjLOgin.click();
		//verify OrangeHRM page,welcomeusername,changepw and logout
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM")));
		{
			System.out.println("OrangeHRM page displaced");
		}
		boolean bolwcres=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='option-menu']/li[1]"), "Welcome qaplanet1"));
		if(bolwcres)
		{
			System.out.println("welcome +sUNd isplaced");
			System.out.println("1");
		}
		WebElement CPW=Driver.findElement(By.linkText("Change Password"));
		WebElement Logout=Driver.findElement(By.linkText("Logout"));
		if(CPW.isDisplayed())
		{
			System.out.println("Change Password id displaced");
		if(Logout.isDisplayed())
		{
			System.out.println("Logout button displaced");
			System.out.println("2");
		}
		}
		Actions A=new Actions(Driver);
		WebElement PIM=Driver.findElement(By.id("pim"));
		A.moveToElement(PIM).build().perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add Employee"))).click();
		//wait for frame and switch to it 
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
		//verify addemploye page
		if(Driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2")).getText().equals("PIM : Add Employee"));
		{
		System.out.println("Add employe page displaced");
		}
		//get Emplye id
		String sEmpID=Driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
		String sLN="krish";
		String sFN="Krishna";
		WebElement SveBtn=Driver.findElement(By.id("btnEdit"));
		SveBtn.click();
		Alert A1=wait.until(ExpectedConditions.alertIsPresent());
		if(A1.getText().equals("Last Name Empty!"))
		{
		System.out.println("Last Name Empty displaced");
		A1.accept();
		}
		Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
		SveBtn.click();
		Alert A2=wait.until(ExpectedConditions.alertIsPresent());
		if(A2.getText().equals("First Name Empty!"))
		{
			System.out.println("First Name Empty displaced");
			A2.accept();
		}
		Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);
		SveBtn.click();
		boolean bolpsnldtres=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/form/div[2]/div[1]/div[2]/div[1]/h2"), "Personal Details"));
		if(bolpsnldtres)
	//if(Driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2")).equals("Personal Details"))
		{
			System.out.println("Personal Details page displaced ");
			System.out.println("3");
		}
	//click on Employe list
	Driver.switchTo().parentFrame();
	WebElement objPIM=Driver.findElement(By.id("pim"));
	A.moveToElement(objPIM).build().perform();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Employee List"))).click();
	//wait for frame and switch to it 
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
	//verify Employee Information page
	if(Driver.findElement(By.xpath("//*[@id='standardView']/div[1]/h2")).getText().equals("Employee Information"));
	{
	System.out.println("Employee Information page displaced");
	}
	//verify employe in the table
	int rc=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
	int i;
	for(i=1;i<=rc;i++)
	{
		//Get second column data
		String EmpID=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
		//Get third column data
		String EmpName=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
		if(sEmpID.equals(EmpID) && EmpName.equals(sFN+" "+sLN))
		{
			System.out.println(EmpID+" ,"+EmpName+" displayed at :"+i);
			System.out.println("4");
			break;
		}}
	
	//Delate Employe
	Driver.findElement(By.name("chkLocID[]")).click();
	//WebElement ObjDltbtn=Driver.findElement(By.linkText("button"));
	WebElement ObjDltbtn=Driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[2]"));
	if(ObjDltbtn.isDisplayed())
	{
		System.out.println("Delate Employe succes");
	}
	ObjDltbtn.click();
	Driver.switchTo().defaultContent();
	Driver.close();
	Driver.quit();
	}}
	


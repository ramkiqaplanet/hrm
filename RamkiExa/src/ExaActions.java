import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExaActions
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Brow=new ChromeDriver();
		//Brow.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(Brow, 30);
		//pw un
		Brow.get("http://apps.qaplanet.in/qahrm/login.php");
		wait.until(ExpectedConditions.titleContains("OrangeHRM - New Level of HR Management"));
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("title open");
		}
		WebElement objUN=Brow.findElement(By.name("txtUserName"));
		WebElement objPW=Brow.findElement(By.name("txtPassword"));
		objUN.clear();
		objUN.sendKeys("qaplanet1");
		objPW.clear();
		objPW.sendKeys("lab1");
		Brow.findElement(By.name("Submit")).click();
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		if(Brow.getTitle().equals("OrangeHRM"))
		{
			System.out.println("OrangeHRM page open");
		}
//Actions
		Actions A=new Actions(Brow);
		WebElement objPIM=Brow.findElement(By.id("pim")); 
		A.moveToElement(objPIM).perform();
		Brow.findElement(By.xpath("//*[@id='pim']/ul/li[2]/a/span")).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
		 Boolean AddTitle = wait.until(ExpectedConditions.textToBePresentInElementLocated
				(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2"), "PIM : Add Employee"));
		if (AddTitle.equals("PIM : Add Employee")){
			System.out.println("Add Employee displaced");
			}
		Brow.findElement(By.id("txtEmpLastName")).sendKeys("ramki");
		Brow.findElement(By.name("txtEmpFirstName")).sendKeys("krishna");
		Brow.findElement(By.id("btnEdit")).click();
		
		Brow.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
		 Boolean PerDet = wait.until(ExpectedConditions.textToBePresentInElementLocated
					(By.xpath("//*[@id='personal']/div[1]/div[2]/div[1]/h2"), "Personal Details"));
			if (PerDet.equals("Personal Details")){
				System.out.println("Personal Details displaced");
				}
			Brow.findElement(By.id("btnEditPers")).click();
			Brow.findElement(By.name("txtEmpNickName")).sendKeys("txtEmpNickName");
			Brow.findElement(By.id("btnEditPers")).click();
			Brow.switchTo().defaultContent();
//Actions
			Actions A1=new Actions(Brow);
			WebElement objPIM1=Brow.findElement(By.id("pim")); 
			A.moveToElement(objPIM1).perform();
			Brow.findElement(By.linkText("Employee List")).click();
			Brow.switchTo().defaultContent();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
			 Boolean EmpInf = wait.until(ExpectedConditions.textToBePresentInElementLocated
						(By.xpath("//*[@id='standardView']/div[1]/h2"), "Employee Information"));
				if (EmpInf.equals("Personal Details")){
					System.out.println("Employee Information");
				}
			//rc
				
			int rc = Brow.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
			//cc
			for (int i = 0; i <=rc; i++) {
				String cc=Brow.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[2]")).getText();
				Brow.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[2]")).click();
		if(cc.equals(""))
			
		{
			
		}
			
			
			
			
			
			}
	
	}
				
}
	















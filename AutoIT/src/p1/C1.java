package p1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import Demo.Cla;

public class C1 {

	public static void main(String[] args) throws Throwable {

	   System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		
		Actions a=new Actions(driver);
		
		WebElement pim=driver.findElement(By.linkText("PIM"));
		a.moveToElement(pim).build().perform();
		Thread.sleep(5000);
		
		WebElement AddEmployee=driver.findElement(By.linkText("Add Employee"));
		a.moveToElement(AddEmployee).build().perform();
		Thread.sleep(5000);
		
		 AddEmployee=driver.findElement(By.linkText("Add Employee"));
		a.moveToElement(AddEmployee).click().build().perform();
		Thread.sleep(5000);
	
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.id("txtEmpLastName")).sendKeys("LastNames");		
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("FirstNames");		
		driver.findElement(By.name("photofile")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Lab\\Desktop\\anto.exe");
		
		
		

		
	}
}
